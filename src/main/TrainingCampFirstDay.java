package main;

import solution.*;

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
        int arr [] = {4,8,4,10,0,7,1,3,7,8,8,3,4,1,6,2,1,1,8,0,9,8,0,3,9,10,3,10,1,10,7,3,2,1,4,9,10,7,6,4,0,8,5,1,2,1,6,2,5,0,7,10,9,10,3,7,10,5,8,5,7,6,7,6,10,9,5,10,5,5,7,2,10,7,7,8,2,0,1,1};
        TrimMean trimMean = new TrimMean();
        System.out.println(arr.length);
        System.out.println(trimMean.trimMean(arr));
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


























