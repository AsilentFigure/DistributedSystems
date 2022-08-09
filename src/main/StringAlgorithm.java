package main;

import java.util.logging.Level;

/**
 * @author ASilentFigure
 * @project DistributedSystems
 * @date 2022/4/26 10:46
 */
public class StringAlgorithm {

    /**
     * 判断字符串s[start:end]是否是回文字符串
     */
    int isPalindrome(String s, int start, int end)
    {
        for (; start < end; ++start,--end) {
            if (s.charAt(start) != s.charAt(end))
                return 0;
        }
        return 1;
    }

    /**
     * @param s
     * @author ASilentFigure
     * @return java.lang.String
     * @throws
     * @date 2022/5/6 15:23
     * 蛮力法
     */
    String longestPalindrome(String s){
        int len = s.length(), maxLen = 1;
        int start = 0, i, j;
        /*遍历字符串所有的子串，若子串为回文字符串则更新最长回文的长度*/
        for(i=0; i < len - 1; i++) {
            for(j = i+1; j < len; j++) {
                if(isPalindrome(s, i, j) == 1) {
                    int pLen = j - i + 1;
                    if(pLen > maxLen) {
                        start = i;
                        maxLen = pLen;
                    }
                }
            }
        }
        return s.substring(start, start+maxLen);
    }

    /**
     * @param s
     * @author ASilentFigure
     * @return java.lang.String
     * @throws
     * @date 2022/4/26 16:23
     * 动态规划
     */
    String longestPalindromeDP(String s){
        int n = s.length();
        int longestBegin = 0, maxLen = 1;
        int i;
        int P [][] = new int [n][n];
        for(i =0; i < n; i++){
            P[i][i] = 1;
        }
        for(i = 0; i < n-1; i++){
            if(s.charAt(i) == s.charAt(i+1)){
                P[i][i+1] = 1;
                longestBegin = i;
                maxLen = 2;
            }
        }
        /*依次求P[i][i+2]...P[i][i+n-1]等*/
        int len = 3;
        for(; len <= n; ++len) {
            for(i=0; i<n-len+1; i++){
                int j = i+len - 1;
                if(s.charAt(i) == s.charAt(j) && P[i+1][j-1] == 1) {
                    P[i][j] = 1;
                    longestBegin = i;
                    maxLen = len;
                }
            }
        }

        return s.substring(longestBegin, longestBegin+maxLen);
    }

    private int longestBegin = 0;
    private int longestLen = 1;
    /**
     * 求位置l为中心的最长回文子串的开始位置和长度
     */
    void expandAroundCenter(String s, int l, int r){
        int n = s.length();
        while(l>= 0 && r<= n-1 && s.charAt(l) == s.charAt(r)){
            l--;
            r++;
        }
        longestBegin = l+1;
        longestLen = r-l-1;
    }

    /**
     * @param s
     * @author ASilentFigure
     * @return java.lang.String
     * @throws
     * @date 2022/4/26 16:55
     * 中心法
     */
    String longestPalindromeCenter(String s){
        int n = s.length();
        if (n == 0)
            return s;
        int iLongestBegin = 0, iLongestLen = 0;
        for(int i = 0; i < n; i++) {

            expandAroundCenter(s, i, i);
            if(longestLen > iLongestLen) {
                iLongestLen = longestLen;
                iLongestBegin = longestBegin;
            }

            expandAroundCenter(s, i, i+1);
            if(longestLen > iLongestLen) {
                iLongestLen = longestLen;
                iLongestBegin = longestBegin;
            }
        }
        return s.substring(iLongestBegin, iLongestBegin+iLongestLen);
    }
}
