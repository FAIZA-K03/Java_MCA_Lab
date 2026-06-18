/*Digit Separator Scenario: You need to develop a module that reads a 4-digit number and
prints the digits on separate lines for a data entry application.
*/

import java.util.Scanner;
public class DigitSeparator {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        int num;
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        int rev = 0;
        int digit;
        while (num > 0) {
            digit = num % 10;
            rev = rev * 10 + digit;
            num = num / 10;
        }
        while (rev > 0) {
            digit = rev % 10;
            System.out.println(digit);
            rev = rev / 10;
        }
    }
}