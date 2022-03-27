class P189 {
    public void rotate(int[] nums, int k) {
            int[] temp = new int[nums.length];
            for (int i = 0; i < nums.length; i++) {
                temp[(i + k) % nums.length] = nums[i];
            }
            for (int i = 0; i < nums.length; i++) {
                nums[i] = temp[i];
            }
            return;
    }
    // We need to think about the relationship between the new location and the original — how to calculate? We can start with the last element in the above example. 
    //7 (was at index 6) is rotated in 3 steps, the final location is at index 2. We can think it as we push 7 to a new array, 
    //and the new idx is 9 (the overall location starting from 0):
    // idx:     0  1  2  3  4  5  6                   7  8   9  10 11 12 13
    // old array: [] [] [] [] [] [] [7] -> new array: [] [] [7] [] [] [] []
    // So, no matter how far it was pushed away, we can always find it’s relative index between (0–6) through % n (arrays’ length) operation.
   
   // Other Solution
    //It'll have a TL Exception
    public int[] rotatedArray(int[] arr, int n) {
        while (n>0) {
            int temp = arr[arr.length -1];
            
            for (int j = arr.length-2; j >= 0; j--) {
                arr[j+1] = arr[j];
            }
            arr[0] = temp;
            n--;
        }
        return arr;
    }

}

