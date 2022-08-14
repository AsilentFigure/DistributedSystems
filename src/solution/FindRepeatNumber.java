package solution;

import java.util.HashSet;
import java.util.Set;

public class FindRepeatNumber {

    public int findRepeatNumber1(int[] nums) {
        int result = nums[0];
        Set<Integer> set = new HashSet<>();
        for(int num : nums){
            if(set.contains(num)){
                return num;
            }
            set.add(num);
        }
        return result;
    }

    public int findRepeatNumber(int[] nums) {
        int result = -1;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == i){
                continue;
            }
            if(nums[i] == nums[nums[i]]){
                return nums[i];
            }
            swap(nums, nums[nums[i]], nums[i]);
        }
        return result;
    }

    private void swap(int[] nums, int a, int b){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}
