package solution;

import java.util.Arrays;
import java.util.Random;

public class SortArray {

    public int[] sortArray(int[] nums) {
        quickSort(nums, 0, nums.length - 1);
        return nums;
    }

    private void quickSort(int[] nums, int left, int right){
        // 小区间使用插入排序
        if (right - left <= 7) {
            Arrays.sort(nums);
            return;
        }
        int pIndex = partition(nums, left, right);
        quickSort(nums, left, pIndex - 1);
        quickSort(nums, pIndex + 1, right);
    }

    public int partition(int[] nums, int lo, int hi){

        Random random = new Random();
        int randomIndex = lo + random.nextInt(hi - lo + 1);
        exchange(nums, lo, randomIndex);

        int pivot = nums[lo];
        int i = lo + 1;
        int j = hi;
        while (true) {
            while (i <= hi && nums[i] < pivot){
                i++;
            }
            while (j > lo && nums[j] > pivot){
                j--;
            }
            if (i >= j){
                break;
            }
            exchange(nums, i, j);
            i++;
            j--;
        }
        exchange(nums, lo, j);
        return j;
    }

    public void exchange(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
