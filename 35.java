class P35 {
    //Input: nums = [1,3,5,6], target = 5
    //output: 2
    public int searchInsert(int[] nums, int target) {
        for(int i = 0 ; i < nums.length ; i++)
        {
            if(nums[i] >= target)
                return i;
        }
        return nums.length;
    
    }
}