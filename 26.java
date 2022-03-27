
import java.util.*;
class p26 {
    public int removeDuplicates(int[] nums) {
                int count = 1;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                nums[i]=Integer.MAX_VALUE;
            }else{
                count++;
            }
        }
        Arrays.sort(nums);
        return count;
    }
}