/**
 * Program: Remove duplicates from a sorted array
 * Given a sorted array nums, remove the duplicates in-place such that each element appear only once and return the new length.
 * Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.
 * @author: Ivy P
 * @version: 04/12/20
 */

import java.util.*;
public class RemoveDupFromSortedArray {

    public static void main(String[] args){
        int[] array = {1, 1, 2, 3, 3, 4, 4, 5};
       removeDuplicates(array); // calling the method to remove the duplicates
    } // end of main method

    // method to remove the duplicates
    public static void removeDuplicates(int[] nums) {
        int lastIndex = 0;
        for (int i = 1; i < nums.length; i++ ) {
                if (nums[lastIndex] != nums[i] )
                lastIndex++;
                nums[lastIndex] = nums[i];
            }
        int[] newList = new int[lastIndex + 1];
        for (int i = 0; i <= lastIndex; i++) {
            newList[i] = nums[i];
        }
        System.out.println(Arrays.toString(newList));
        }
}


