import java.util.Arrays;
import java.util.List;

// Sqrt ech erlement and the produce sorted array
class P977 {
    public int[] sortedSquares(int[] nums) {
     for (int i = 0; i < nums.length; i++) {
         nums[i] = nums[i] * nums[i];
     }
    return Arrays.stream(nums).sorted().toArray();   
    }
}