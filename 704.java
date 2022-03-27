class P704 {
    public int search(int[] nums, int target) {
        int lo = 0;
        int high = nums.length -1;
        while (lo <= high) {
            int middle = lo + (high-lo)/2;
            if (middle== target) {
                return middle;
            } else if (nums[middle] < target){
                lo = middle +1;
            }else{
                high = middle -1;
            }
        }
        return -1;
}
}
