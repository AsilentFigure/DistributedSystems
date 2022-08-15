package solution;

/**
 *771. 宝石与石头
 * @author ASilentFigure
 * @project DistributedSystems
 * @date 2022/8/10 15:55
 */
public class NumJewelsInStones {

    public int numJewelsInStones(String jewels, String stones) {
        int result = 0;
        for(int i = 0; i < stones.length(); i++){
            if(jewels.contains("" + stones.charAt(i))) {
                result++;
            }
        }
        return result;
    }
}
