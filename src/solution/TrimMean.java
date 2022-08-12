package solution;

import java.util.Arrays;

/**
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
