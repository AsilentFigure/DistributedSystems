package main;

import java.util.Arrays;

/**
 * @author ASilentFigure
 * @project DistributedSystems
 * @date 2022/4/24 10:02
 */
public class main {
    //---------------测试---------------
    public static void main(String[] args) {
        int [] array = {1, 3, -1, -3, 5, 3, 6, 7};
        MaxSidingWindow maxSidingWindow = new MaxSidingWindow();
        int B [] = new int[array.length - 2];
        maxSidingWindow.maxSlidingWindowSimple(array, array.length, 3, B);
        System.out.println(Arrays.toString(B));
    }

}
