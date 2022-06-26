import java.util.*;
 
public class Solution
{
    public boolean containsDuplicate(int[] nums) {
        int l = nums.length;
        for (int i=0; i<l; i++) {
           for (int j=i+1; j<l; j++) {
              if (nums[i] == nums[j]) {
                 return true;
              }
           }
        }
        return false;
    }
 
    /* Driver Function to test other function */
    public static void main(String[] args)
    {
        Solution gfg = new Solution();
        String[] input = {"flower","flow","flight"};
        System.out.println( "The longest Common Prefix is : " );
    }
}