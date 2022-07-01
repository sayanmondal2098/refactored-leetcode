import java.util.Arrays;

class P724 {
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
}
