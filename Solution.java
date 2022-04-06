import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {

    public int threeSumMulti(int[] arr, int target) {
        int mod = 1000000007;
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            int count[] = new int[101];
            for (int j = i+1; j < arr.length; j++) {
                int k = target - arr[i] - arr[j];   
                if (k>=0 &&  k <=100 && count[k] >0 )  {
                    result += count[k];
                    result %= mod;
                }
                count[arr[j]]++;
            }
        }
        return result;
    }


    public static void main(String[] args) {
        String input = "IV";
        int x = 101;
        Solution sol = new Solution();
        int output = sol.romanToInt(input);
        System.out.println(output);
    }
}