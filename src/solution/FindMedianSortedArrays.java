package solution;
/**
 * 4. 寻找两个正序数组的中位数
 * @author ASilentFigure
 * @return 
 * @throws
 * @date 2022/8/15 15:44
 */
public class FindMedianSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double result = 0;
        int m = nums1.length, n = nums2.length;
        int len = m + n;
        if((len&1) == 0){
            result = (getKElement(nums1, nums2, len / 2) + getKElement(nums1, nums2, len / 2 + 1)) / 2.0;
        } else {
            result = getKElement(nums1, nums2, len / 2 + 1);
        }
        return result;
    }

    public int getKElement(int[] nums1, int[] nums2, int k){
        int m =nums1.length, n = nums2.length;
        int index1 = 0, index2 = 0;
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
            int newIndex1 = Math.min(half + index1, m) - 1;
            int newIndex2 = Math.min(half + index2, n) - 1;
            int pivot1 = nums1[newIndex1], pivot2 = nums2[newIndex2];
            if(pivot1 <= pivot2){
                k -= (newIndex1 - index1 + 1);
                index1 = newIndex1 + 1;
            } else {
                k -= (newIndex2 - index2 + 1);
                index2 = newIndex2 + 1;
            }
        }
    }
}
