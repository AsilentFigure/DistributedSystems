package solution;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {

    public int majorityElement1(int[] nums) {
        int result = 0;
        int max = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for(int num : nums){
            if(map.containsKey(num)){
                map.put(num,map.get(num)+1);
            }else {
                map.put(num,1);
            }
            if(map.get(num) > max){
                max = map.get(num);
                result = num;
            }
        }
        return result;
    }

    public int majorityElement(int[] nums) {
        Integer candidate = null;
        int count = 0;
        for (int num : nums){
            if(count == 0){
                candidate = num;
            }
            count += (num == candidate) ? 1 : -1;
        }

        return candidate;
    }
}
