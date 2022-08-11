package main;

import solution.CheckIfPangram;
import solution.CountConsistentStrings;
import solution.FindMedianSortedArrays;
import solution.SmallerNumbersThanCurrent;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @author ASilentFigure
 * @project DistributedSystems
 * @date 2022/8/2 10:47
 */
public class TrainingCampFirstDay {

    public static void main(String[] args) {
        CheckIfPangram checkIfPangram = new CheckIfPangram();
        checkIfPangram.checkIfPangram("dad");
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

}


























