package solution;

import java.util.*;
import java.util.stream.Collectors;

public class RelativeSortArray {

    public int[] relativeSortArray(int[] arr1, int[] arr2) {

        Map<Integer, Integer> map = new TreeMap<>();
        for(int i = 0; i< arr2.length; i++){
            map.put(arr2[i], i);
        }
        Comparator comparator = new Comparator<Integer>() {
            public int compare(Integer a, Integer b){
                if(map.containsKey(a) && map.containsKey(b)){
                    return map.get(a) - map.get(b);
                }else if(map.containsKey(a)){
                    return -1;
                }else if(map.containsKey(b)){
                    return 1;
                }else {
                    return a - b;
                }
            }
        };
        List<Integer> list = Arrays.stream(arr1).boxed().collect(Collectors.toList());
        list.sort(comparator);
        arr1 = list.stream().mapToInt(Integer::valueOf).toArray();
        return arr1;
    }
}
