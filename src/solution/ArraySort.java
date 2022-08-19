package solution;

import java.util.Arrays;

/**
 * @author ASilentFigure
 * @project TrainingCampFirstDay
 * @date 2022/8/18 10:38
 */
public class ArraySort {

    public int[] arraySort(int[] nums) {
        partitionQuickSort(nums, 0, nums.length - 1);
        return nums;
    }

    private void partitionQuickSort(int[] nums, int lo, int hi){
        if(lo < hi){
            int k = partition(nums, lo, hi);
            partitionQuickSort(nums, lo, k - 1);
            partitionQuickSort(nums, k + 1, hi);
        }
    }

    private int partition(int[] nums, int lo, int hi){
        int num = nums[(lo + hi) / 2];
        swap(nums, lo, (lo + hi) / 2);
        int i = lo + 1;
        int j = hi;
        while (true){
            while (i <= hi && nums[i] < num){
                i++;
            }
            while (j > lo && nums[j] > num){
                j--;
            }
            if(i >= j){
                break;
            }
            swap(nums, i++, j--);
        }
        swap(nums, lo, j);
        return j;
    }

    private void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
