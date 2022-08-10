package solution;

import java.beans.beancontext.BeanContext;
import java.util.HashSet;
import java.util.Set;

/**
 * @author ASilentFigure
 * @project DistributedSystems
 * @date 2022/8/10 16:31
 */
public class CountConsistentStrings {

    public int countConsistentStrings(String allowed, String[] words) {
        int result = 0;
        Set<Character> allowSet = new HashSet<Character>();
        for(int i = 0; i < allowed.length(); i++){
            allowSet.add(allowed.charAt(i));
        }
        for(int i = 0; i < words.length; i++){
            for(int j = 0; j < words[i].length(); j++){
                if(!allowSet.contains(words[i].charAt(j))){
                    break;
                }
                if(j == words[i].length() - 1){
                    result++;
                }
            }
        }
        return result;
    }
}
