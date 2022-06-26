import java.util.*;
 
public class Solution
{
    public int maxScore(int[] cardPoints, int k) {
        int total = 0, best_total = 0;
        for (int i = 0; i < k; i++) {
            total += cardPoints[i];
        }
        best_total = total;
        for (int i = k-1, j = cardPoints.length-1; i >= 0;i--,j--) {
            total += -cardPoints[i] + cardPoints[j];
            best_total = Math.max(best_total, total);
        }
        return best_total;
    }
 
    /* Driver Function to test other function */
    public static void main(String[] args)
    {
        Solution gfg = new Solution();
        int [] cardPoints = {9,7,7,9,7,7,9}; int k = 7;
        System.out.println(gfg.maxScore(cardPoints, k));
    }
}