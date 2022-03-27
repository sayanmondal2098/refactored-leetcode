import java.util.Arrays;
import java.util.List;

class Solution {
    public int[] rotatedArray(int[] arr, int n) {
        while (n>0) {
            int temp = arr[arr.length -1];
            
            for (int j = arr.length-2; j >= 0; j--) {
                arr[j+1] = arr[j];
            }
            arr[0] = temp;
            n--;
        }
        return arr;
    }

    public static void main(String[] args) {
        int testarr[] = {1,2,3,4,5,6};
        int finalarr[] = new Solution().rotatedArray(testarr, 4);
        for (int i = 0; i < finalarr.length; i++) {
            System.out.println(finalarr[i]);
        }
    }
}