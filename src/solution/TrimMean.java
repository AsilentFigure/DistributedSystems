package solution;

import java.util.Arrays;

/**
 *1619. 删除某些元素后的数组均值
 * @author ASilentFigure
 * @project DistributedSystems
 * @date 2022/8/12 11:02
 */
public class TrimMean {
    public double trimMean(int[] arr) {
        double result = 0.0;
        int sum = 0;
        Arrays.sort(arr);
        for(int i = (int) (0.05 * arr.length); i < (int)(0.95 * arr.length); i++){
            sum += arr[i];
        }
        result = sum / (double)(arr.length * 0.9);
        return result;
    }
}
