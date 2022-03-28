import java.util.Arrays;
import java.util.List;

class Solution {

    public int[] twoSum(int[] numbers, int target) {
        for (int i = 0; i < numbers.length-1; i++) {
            int find = target - numbers[i];
            for (int j = i+1; j < numbers.length; j++) {
                if (numbers[j]==find) {
                    return new int[]{i+1, j+1};
                }else   if (numbers[j]>find) {
                    break;
                }
            }
        }
        return null;
    }


    public static void main(String[] args) {
        int testarr[] = {0,1,0,3,12};
        testarr =  new Solution().twoSum(testarr,0);
        for (int i = 0; i < testarr.length; i++) {
            System.out.println(testarr[i]);
        }
    }
}