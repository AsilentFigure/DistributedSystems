package solution;

/**
 *389. 找不同
 * @author ASilentFigure
 * @project DistributedSystems
 * @date 2022/8/15 11:11
 */
public class FindTheDifference {

    public char findTheDifference(String s, String t) {
        int sChar = 0;
        for(int i = 0; i < s.length(); i++){
            sChar += s.charAt(i);
        }
        int tChar = 0;
        for(int i = 0; i < t.length(); i++){
            tChar += t.charAt(i);
        }
        return (char) (tChar - sChar);
    }

}
