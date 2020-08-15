
/** Program: Squareroot of x
 * Compute and return the square root of x, where x is guaranteed to be a non-negative integer.
 * Since the return type is an integer, the decimal digits are truncated and only the integer part of the result is returned.
 * Example 1: Input: 4 -> Output: 2
 * Example 2: Input: 8 -> Output: 2.
 *            Explanation: The square root of 8 is 2.82842..., and since the decimal part is truncated, 2 is returned.
 * @author Ivy P.
 * @version 8/1/2020
 */

public class SquareRoot {
    public static void main(String[] args){
       System.out.println(mySqrt(16));
    }// end of main method

    public static int mySqrt(int x) {
        double result = Math.pow(x, 0.5); // calculate Square root of the number
        return (int)result;
    } // end of method
}
