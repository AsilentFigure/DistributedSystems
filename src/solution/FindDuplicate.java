package solution;

import java.util.HashMap;
import java.util.Map;

public class FindDuplicate {

    public int findDuplicate1(int[] nums) {
        int result = 0;
        int max = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for(int num : nums){
            if(map.containsKey(num)){
                map.put(num,map.get(num)+1);
            }else {
                map.put(num,1);
            }
            if(map.get(num) > max){
                max = map.get(num);
                result = num;
            }
        }
        return result;
    }

    public int findDuplicate(int[] nums) {
        int slow = 0, fast = 0;
        do {
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while (slow != fast);
        slow = 0;
        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }
        return slow;
    }

}
