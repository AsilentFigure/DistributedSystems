package solution;

import java.util.*;
import java.util.stream.Collectors;

/**
 *1636. 按照频率将数组升序排序
 * @author ASilentFigure
 * @project DistributedSystems
 * @date 2022/8/15 10:05
 */
public class FrequencySort {

    public int[] frequencySort(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int num : nums){
            if(map.containsKey(num)){
                map.put(num, map.get(num)+1);
            }else {
                map.put(num, 1);
            }
        }
        Comparator comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if(map.get(o1) > map.get(o2)){
                    return 1;
                }else if(map.get(o1) < map.get(o2)){
                    return -1;
                }else {
                    return o2 - o1;
                }
            }
        };
        List<Integer> list = Arrays.stream(nums).boxed().collect(Collectors.toList());
        list.sort(comparator);
        nums = list.stream().mapToInt(Integer::valueOf).toArray();
        return nums;
    }
}
