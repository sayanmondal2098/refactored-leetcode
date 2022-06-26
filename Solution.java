import java.util.*;
 
public class Solution
{
    public int maxProfit(int[] prices) {
        int max_profit = 0, buy = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i]<buy) {
                buy = prices[i];
            }
            else if (max_profit < prices[i] - buy) {
                max_profit = prices[i] - buy;
            }
        }
        return max_profit;
    }
 
    /* Driver Function to test other function */
    public static void main(String[] args)
    {
        Solution gfg = new Solution();
        int [] cardPoints = {9,7,7,9,7,7,9}; int k = 18;
        System.out.println(gfg.twoSum(cardPoints, k));
        for (int num : gfg.twoSum(cardPoints, k)) {
            System.out.print(num + " ");
        }
    }
}