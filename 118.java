import java.util.Arrays;
import java.util.List;

//Input: numRows = 5
//Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]

class P118 {
    public List<List<Integer>> generate(int numRows) {
        int[][] pascal = new int[numRows][];
        for (int i = 0; i < numRows; i++){
            int[] row = new int[i + 1];
            row[0] = 1;
            row[i] = 1;
            for (int j = 1; j < i; j++){
                row[j] = pascal[i - 1][j - 1] + pascal[i - 1][j];
            }
            pascal[i] = row;
        }
        return (List)Arrays.asList(pascal);
    }
}