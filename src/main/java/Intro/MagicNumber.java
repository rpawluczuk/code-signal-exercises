//Ticket numbers usually consist of an even number of digits.
// A ticket number is considered lucky if the sum of the first
// half of the digits is equal to the sum of the second half.
//
//Given a ticket number n, determine if it's lucky or not.
//
//Example
//
//    For n = 1230, the output should be
//    isLucky(n) = true;
//    For n = 239017, the output should be
//    isLucky(n) = false.

package Intro;

public class MagicNumber {
    public static void main(String[] args) {
        int n = 123321;
        boolean result = isLucky(n);
        System.out.println(result);
    }

    private static boolean isLucky(int n) {
        boolean result = true;
        int length = String.valueOf(n).length();
        int counter = 0;
        int digit = 0;
        for (int i = 0; i < length; i++) {
            digit = (int) ((n % Math.pow(10, i + 1)) / Math.pow(10, i));
            if (i < length / 2) counter += digit;
            else counter -= digit;
        }
        if (counter != 0) result = false;
        return result;
    }
}
