import java.math.BigInteger;
import java.util.*;


// solution idea I : Check the last digit , if its 9 , then increase the new array size by one , other wise copy and increase the last element by one
public class Solution
{
    public int pivotIndex(int[] nums) {
        int index = 0;
        int sum = Arrays.stream(nums).sum();
        for (int i = 0; i < nums.length; i++) {
            if (index == sum -index - nums[i]) {
                return i;
            }
            index += nums[i];
        }
        return -1;
    }
 
    /* Driver Function to test other function */
    public static void main(String[] args)
    {
        Solution gfg = new Solution();
        int [] cardPoints = {9,8,7,6,5,4,3,2,1,0}; int k = 18;
        gfg.plusOne(cardPoints);
        
    }
}