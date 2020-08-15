
/**
 * Program: Reverse an Integer
 * Given a 32-bit signed integer, reverse digits of an integer.
 * Example 1: Input: 123
 *            Output: 321
 * Example 2: Input: -123
 *            Output: -321
 * Example 3: Input: 120
 *            Output: 21
 * @author: Ivy P.
 * @version 04/16/20
 */

public class ReversInteger {

    public static void main(String[] args) {
        System.out.println(reverse(-153426489)); //calling method to reverse the integer
    }
    // method to reverse the integer
    public static int reverse(int x) {
        String num = "" + x;  // convert to a string

        if (num.charAt(0) == '-')    // check if the number is negative
            num = num.substring(1); //if number is negative, reverse only the digits, not the (-) sign

        int digit = num.length() - 1; //digit to reverse, start from the last digit
        String newNum = "";
        // looping thru the number, from last digit to first digit
        while (digit >= 0) {
            newNum += num.charAt(digit);
            digit--;
        }
        long reversedNum = Long.parseLong(newNum); // check if the reversed number in out of range for an int
        if ((reversedNum > (Math.pow(2, 31) - 1)))
            return 0;
        // if x is in the range, return the reversed number.
        if (x > 0)
            return Integer.parseInt(newNum);
        else
            return Integer.parseInt(newNum) * (-1); // add the (-) sign if the original number was a negative number
    } // end of method
}





