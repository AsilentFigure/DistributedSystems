package solution;

/**
 *1608. 特殊数组的特征值
 * @author ASilentFigure
 * @project DistributedSystems
 * @date 2022/8/15 10:31
 */
public class SpecialArray {

    public int specialArray(int[] nums) {
        int[] cnt = new int [1001];
        for(int num : nums){
            cnt[num]++;
        }
        for(int i = 999; i >= 0; i--){
            cnt[i] += cnt[i+1];
        }
        for(int n : cnt){
            if(n == cnt[n]){
                return n;
            }
        }
        return -1;
    }
}
