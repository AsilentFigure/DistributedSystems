package solution;

import java.util.Arrays;

/**
 * @author ASilentFigure
 * @project DistributedSystems
 * @date 2022/8/12 10:26
 */
public class CanMakeArithmeticProgression {

    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        int constant = arr[1] - arr[0];
        for(int i = 1; i < arr.length; i++){
            if(!(arr[i] - arr[i-1] == constant)){
                return false;
            }
        }
        return true;
    }

}
