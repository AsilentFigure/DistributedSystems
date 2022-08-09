package main;

/**
 * @author ASilentFigure
 * @project DistributedSystems
 * @date 2022/5/9 10:25
 */
public class MaxSidingWindow {

    /**
     * @param Array
     * @param n
     * @author ASilentFigure
     * @return int
     * @throws
     * @date 2022/5/9 10:28
     * 求数组从n-w到n的最大值
     */
    int maxInArray(int Array[] , int n){
        int max = Array[0], i;
        for(i = 1; i < n; i++){
            if(Array[i] > max){
                max = Array[i];
            }
        }
        return max;
    }

    /**
     * @param Array
     * @param n
     * @author ASilentFigure
     * @return int[]
     * @throws
     * @date 2022/5/9 15:00
     * 将数组向左移动n位
     */
    int [] shiftLeftArray(int Array[], int n){
        int [] arrayCopy = new int[Array.length];
        for(int i = 0; i < Array.length - n; i++){
            arrayCopy[i] = Array[i+n];
        }
        return arrayCopy;
    }

    void maxSlidingWindowSimple(int Array[], int n, int w, int B[]){
        int i;
        for(i = 0; i <= n - w; i++){
            B[i] = maxInArray(shiftLeftArray(Array, i), w);
        }
    }
}
