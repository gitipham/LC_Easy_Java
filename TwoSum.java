/**
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * @author Ivy P.
 * @version 04/12/20
 */

public class TwoSum {
    public static void main(String[] args){
        int[] numArray = {2, 6, 7, 8, 9};
        twoSum(numArray, 14);
    }
    //method to add 2 numbers
    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];   // new array to hold the result
        for (int i = 0; i < nums.length; i++) { //loop thru array to find the first number
            for (int j = i +1; j < nums.length; j++) { //loop thru the array to find the second number to match the target
                if (nums[i] + nums[j] == target){
                    result[0] = i;
                    result[1] = j;
                }
            }
        }
        return result;
    }
}
