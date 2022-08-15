package solution;

/**
 *75. 颜色分类
 * @author ASilentFigure
 * @project DistributedSystems
 * @date 2022/8/15 15:36
 */
public class SortColors {

    public void sortColors(int[] nums) {
        partition(nums, 0, nums.length, 1);
        partition(nums, 0, nums.length, 2);
    }

    public void partition(int[] nums, int lo, int hi, int t){
        int m = lo - 1;
        for(int i = lo; i < hi;i++){
            if(nums[i] != t){
                swap(nums, i, ++m);
            }
        }
    }

    private void swap(int[] nums, int a, int b){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}
