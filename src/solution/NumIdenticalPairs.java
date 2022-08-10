package solution;

import java.util.HashMap;
import java.util.Map;

/**
 * @author ASilentFigure
 * @project DistributedSystems
 * @date 2022/8/10 16:13
 */
public class NumIdenticalPairs {

    public int numIdenticalPairs1(int[] nums) {
        int result = 0;
        for(int i = 0; i < nums.length; i++){
            for(int j = i+1; j < nums.length; j++){
                if(nums[i] == nums[j]){
                    result++;
                }
            }
        }
        return result;
    }

    public int numIdenticalPairs(int[] nums) {
        int result = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            int v = entry.getValue();
            result += v * (v- 1) / 2;
        }
        return result;
    }

}
