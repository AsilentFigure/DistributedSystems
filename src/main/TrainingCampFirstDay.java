package main;

/**
 * @author ASilentFigure
 * @project DistributedSystems
 * @date 2022/8/2 10:47
 */
public class TrainingCampFirstDay {

    public static void main(String[] args) {
        int a[] = { 1};
        int b[] = { 2, 3, 4, 5, 6};
        System.out.println(getKthElement(a, b, 4));
    }

    void abcSortTwice(int nums[]){
        int len = nums.length;
        partition(nums, 0, len - 1, 1);
        partition(nums, 0, len - 1, 2);
    }

    void partition(int nums[], int lo, int hi, int t) {
        int m = lo -1;
        for(int i = lo; i<= hi; i++){
            if(nums[i] > t ){
                swapNums(nums, ++m, i);
            }
        }
    }

    void swapNums(int nums[], int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    static double  mergeTwoArrays(int[] nums1, int[] nums2){
        double result;
        int len1 = nums1.length, len2 = nums2.length;
        int a = 0, b = 0;
        int nums3[] = new int [len1 + len2];
        for(int i = 0; i < nums3.length && a < len1 && b < len2; i++){
            if(nums1[a] <= nums2[b]){
                nums3[i] = nums1[a];
                a++;
            } else {
                nums3[i] = nums2[b];
                b++;
            }
        }
        if( a < len1){
            for(int i = a + len2; i < nums3.length; i++){
                nums3[i] = nums1[a];
                a++;
            }
        }
        if( b < len2){
            for(int i = b + len1; i < nums3.length; i++){
                nums3[i] = nums2[b];
                b++;
            }
        }
        if((len1 + len2) % 2 == 0 ){
            result = (nums3[(len1 + len2) / 2] + nums3[(len1 + len2) / 2 - 1]) / 2.0;
        } else {
            result = nums3[(len1 + len2 - 1) / 2];
        }
        return result;
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double result = 0;
        int m = nums1.length, n = nums2.length;
        int len = m + n;
        if( (len & 1) == 0) {
            result = (getKthElement(nums1, nums2, len / 2) + getKthElement(nums1, nums2, len / 2 + 1)) / 2.0;
        }else {
            result = getKthElement(nums1, nums2, len / 2 + 1);
        }
        return result;
    }

    public static int getKthElement(int[] nums1, int[] nums2, int k){
        int m = nums1.length, n = nums2.length;
        int index1 = 0 , index2 = 0;
        while (true){

            if(index1 == m){
                return nums2[k + index2 - 1];
            }
            if(index2 == n){
                return nums1[k + index1 - 1];
            }
            if(1 == k){
                return Math.min(nums1[index1], nums2[index2]);
            }

            int half = k / 2;
            int newIndex1 = Math.min(index1 + half, m) - 1;
            int newIndex2 = Math.min(index2 + half, n) - 1;
            int povt1 = nums1[newIndex1], povt2 = nums2[newIndex2];
            if(povt1 <= povt2){
                k -= (newIndex1 - index1 + 1);
                index1 = newIndex1 + 1;
            } else {
                k -= (newIndex2 - index2 + 1);
                index2 = newIndex2 + 1;
            }
        }
    }
}
