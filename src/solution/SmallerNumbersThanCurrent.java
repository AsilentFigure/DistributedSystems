package solution;

import java.util.Arrays;
import java.util.HashMap;

/**
 *1365. 有多少小于当前数字的数字
 * @author ASilentFigure
 * @project DistributedSystems
 * @date 2022/8/11 9:26
 */
public class SmallerNumbersThanCurrent {
    public int[] smallerNumbersThanCurrent1(int[] nums) {
        int result [] = new int [nums.length];
        int sortNums [] = new int [nums.length];
        for(int i = 0; i < nums.length; i++){
            sortNums[i] = nums[i];
        }
        Arrays.sort(sortNums);

        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = sortNums.length - 1; i >= 0; i--){
            map.put(sortNums[i], i);
        }

        for(int i = 0 ; i < nums.length; i++){
            result[i] = map.get(nums[i]);
        }
        return result;
    }

    public int[] smallerNumbersThanCurrent(int[] nums) {
        int n = nums.length;
        int result [] = new int [n];
        int cnt [] = new int[101];
        for(int i = 0; i < n; i++){
            cnt[nums[i]]++;
        }
        for(int i = 1; i <= 100; i++){
            cnt[i] += cnt[i - 1];
        }
        for(int i = 0; i < n; i++){
            if(nums[i] == 0){
                result[i] = 0;
             } else {
                result[i] = cnt[nums[i] - 1];
            }
        }
        return result;
    }
}
