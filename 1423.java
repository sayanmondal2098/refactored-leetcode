class P1423 {
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
}


//Solution Idea
// Since we're forced to take K amount of cards no matter what, we can solve this problem with a two-pointer system with a sliding window approach.
// Instead of counting the sum of the values between the two pointers, we'll instead be counting the sum of the values outside the sliding window.

// We can start by iterating through the first K cards of our card list (C) and finding the total points.
// At this point, our reverse window will be the cards from i = K to j = C.length - 1. At each iteration, we'll slide the window backwards, 
//removing one card from the left side (-C[i]) and adding one card from the right side (+C[j]) each time.

// We should keep track of the best possible result at each iteration, then return best once we reach the end.
// https://res.cloudinary.com/practicaldev/image/fetch/s--th9xg4Js--/c_limit%2Cf_auto%2Cfl_progressive%2Cq_66%2Cw_880/https://i.imgur.com/ec3x0su.gif