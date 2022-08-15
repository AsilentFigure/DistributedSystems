package solution;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 *747. 至少是其他数字两倍的最大数
 * @author ASilentFigure
 * @project DistributedSystems
 * @date 2022/8/11 16:53
 */
public class DominantIndex {

    public int dominantIndex(int[] nums) {
        int result = -1;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            map.put(nums[i], i);
        }
        Arrays.sort(nums);
        if(nums[nums.length - 1] >= 2 * nums[nums.length - 2]){
            result = map.get(nums[nums.length - 1]);
        }
        return result;
    }

}
