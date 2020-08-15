/**
 * Program Binary Coded Decimal
 * Convert each digit of a Decimal number to a binary number
 * example: input = 1 -> output = 0001
 *          input = 15 -> output = 0001 0101
 * @author Ivy P.
 * @version
 */
import java.util.*;

public class BinaryCodedDecimal  {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many number you want to convert? ");
        int size = input.nextInt();

        String[] numList = new String[size];
        // Adding numbers to convert to the list
        System.out.println("Enter the list of numbers: ");
        for (int i = 0; i < size; i++) {
            numList[i] = input.next();
        }
        //invoke the method to encode decimal to Binary
         codedBinary(numList);
        }// end of main

    public static void codedBinary(String[] list) {
        for (int i = 0; i < list.length; i++){
            System.out.println();
           for (int j = 0; j < list[i].length(); j++){
              String binaryNum = convertToBinary(list[i].charAt(j));
              System.out.print(binaryNum + " ");
            }
        }
    }// end of method

    // each number digit will converted into a Binary number
    public static String convertToBinary(char numDigit) {
        switch (numDigit) {
            case '0' : return "0000";
            case '1' : return "0001";
            case '2' : return "0010";
            case '3' : return "0011";
            case '4' : return "0100";
            case '5' : return "0101";
            case '6' : return "0110";
            case '7' : return "0111";
            case '8' : return "1000";
            case '9' : return "1001";
            default: return "0";
        }
    } // end of method
}// end of class

