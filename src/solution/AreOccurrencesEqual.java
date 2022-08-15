package solution;

/**
 *1941. 检查是否所有字符出现次数相同
 * @author ASilentFigure
 * @project DistributedSystems
 * @date 2022/8/15 14:48
 */
public class AreOccurrencesEqual {

    public boolean areOccurrencesEqual(String s) {
        int[] cnt = new int [26];
        for(int i = 0; i < s.length();i++){
            cnt[s.charAt(i) - 'a']++;
        }
        int result = 0;
        for(int i = 0; i < cnt.length; i++){
            if(cnt[i] != 0){
                result = cnt[i];
                break;
            }
        }
        for(int n : cnt){
            if(n != 0 && n != result){
                return false;
            }
        }
        return true;
    }
}
