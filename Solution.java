import java.util.*;
 
public class Solution
{
    public int maxScore(int[] cardPoints, int k) {
        int a = cardPoints.length-1;
        Arrays.sort(cardPoints);
        System.out.println(a);
        int res = 0;
        for (int i = 0; i<k; i++) {
            res += cardPoints[a];
            a = a-1;
        }
        return res;
    }
 
    /* Driver Function to test other function */
    public static void main(String[] args)
    {
        Solution gfg = new Solution();
        int [] cardPoints = {9,7,7,9,7,7,9}; int k = 7;
        System.out.println(gfg.maxScore(cardPoints, k));
    }
}