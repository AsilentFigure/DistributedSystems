package solution;

import java.util.HashSet;
import java.util.Set;
/**
 *217.存在重复元素
 * @author ASilentFigure
 * @return
 * @throws
 * @date 2022/8/15 15:26
 */
public class ContainsDuplicate {

    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int num : nums){
            if(set.contains(num)){
                return true;
            }
            set.add(num);
        }
        return false;
    }

}
