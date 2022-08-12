package solution;

import java.util.Arrays;

/**
 * @author ASilentFigure
 * @project DistributedSystems
 * @date 2022/8/12 10:12
 */
public class HeightChecker {

    public int heightChecker(int[] heights) {
        int result = 0;
        int expected [] = new int [heights.length];
        System.arraycopy(heights, 0, expected, 0, heights.length);
        Arrays.sort(expected);
        for(int i = 0; i < heights.length; i++){
            if(heights[i] != expected[i]){
                result++;
            }
        }
        return result;
    }
}
