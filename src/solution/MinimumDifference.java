package solution;

import java.util.Arrays;

/**
 *1984. 学生分数的最小差值
 * @author ASilentFigure
 * @project DistributedSystems
 * @date 2022/8/15 15:05
 */
public class MinimumDifference {

    public int minimumDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int[] kNum = new int [nums.length - k + 1];
        for(int i = 0; i < nums.length - k + 1; i++){
            kNum[i] = nums[i+k-1] - nums[i];
        }
        int min = kNum[0];
        for(int i = 0; i < kNum.length; i++){
            if(kNum[i] < min){
                min = kNum[i];
            }
        }
        return min;
    }
}
