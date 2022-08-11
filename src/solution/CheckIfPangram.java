package solution;

import java.util.HashSet;
import java.util.Set;

/**
 * @author ASilentFigure
 * @project DistributedSystems
 * @date 2022/8/11 16:26
 */
public class CheckIfPangram {

    public boolean checkIfPangram(String sentence) {
        Set<Character> set = new HashSet<>();
        for(int i = 0; i < sentence.length(); i++){
            set.add(sentence.charAt(i));
        }
        if(set.size() == 26){
            return true;
        }
        return false;
    }
}
