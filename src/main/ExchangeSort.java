package main;

/**
 * @author ASilentFigure
 * @project DistributedSystems
 * @date 2022/5/7 16:23
 */
public class ExchangeSort {

    private int swapCount = 0;

    void swapChar(char s[], int i, int j){
        char temp = s[i];
        s[i] = s[j];
        s[j] = temp;
        swapCount++;
    }

    void partition(char s[], int lo, int hi, char t){
        int m = lo - 1;
        for(int i = lo; i <= hi; i++){
            if(s[i] != t){
                swapChar(s, ++m, i);
            }
        }
    }
    /**
     * @param s
     * @author ASilentFigure
     * @return void
     * @throws
     * @date 2022/5/7 16:45
     * RGB排序-遍历两次
     */
    void rgbSortTwice(char s[]){
        int len = s.length;
        partition(s, 0, len - 1, 'G');
        partition(s, 0, len - 1, 'B');
    }

    /**
     * @param s
     * @author ASilentFigure
     * @return void
     * @throws
     * @date 2022/5/9 10:25
     * RGB排序，遍历一次
     */
    void rgbSortOnce(char s[]){
        int len = s.length;
        int lo = 0, hi = len - 1;

        int r, g; // ++r和++g分别指向R和G交换的位置
        r = g = lo - 1;
        for(int i = lo; i <= hi; i++){
            if(s[i] == 'R') {
                swapChar(s, ++r, i);
                ++g;
                if(s[i] == 'G'){
                    swapChar(s, g, i);
                }
            }else if(s[i] == 'G') {
                swapChar(s, ++g, i);
            }else {

            }
        }
    }

    public void getSwapCount(){
        System.out.println(swapCount);
    }

}
