/**
 * Determine whether an integer is a palindrome. An integer is a palindrome when it reads the same backward as forward.
 * @author: Ivy P.
 * @version 04/16/20
 */

public class PalindromeNumber {

        public static void main(String[] args){
            System.out.println(isPalindrome(1231321)); // caling the method to check
        } // end of main method

        //method to check if a number is a Palindrome
        public static boolean isPalindrome(int x) {
            String num = "" + x;    // convert to a String;
            int low = 0;           // starting position of the digit from the left
            int high = num.length() - 1;  // starting position of the digit from the right
            boolean isPalindrome = true;    // variable to hold if the number is a Palindrome

            //looping thru the digits from both ends of the number
            while (low <= high) {
                if (num.charAt(low) != num.charAt(high)) {
                    isPalindrome = false;
                    break;
                }
                low++;
                high--;
            }
            return isPalindrome;
        } // end of method
}// end of class

