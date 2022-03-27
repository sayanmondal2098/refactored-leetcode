import java.util.Arrays;
import java.util.List;

class Solution {
    public int searchInsert(int[] nums, int target) {
        int high = 0, low = 0;
        int mid = 0, ans = 0;
        while (low <= high) {
            mid = low + (high - low)/2;
            if (nums[mid] == target) {
                return mid;
            }else if (nums[mid] < target) {
                low = mid + 1;
                ans = mid+1;
            }else {
                high = mid - 1;
                ans = mid-1;
            }
        }
        return nums.length;
    }
}