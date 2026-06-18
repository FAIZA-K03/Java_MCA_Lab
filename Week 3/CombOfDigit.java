/*Combination of Digits
Scenario: You need to develop a module that accepts three digits and prints all possible combinations
of these digits for a lottery system.*/

import java.util.Scanner;
public class CombOfDigit {
    public static void main(String[] args) {
        System.out.println("Enter three digits:");
        int digits[] = new int[3];
        Scanner sc = new Scanner(System.in);
        digits[0] = sc.nextInt();
        digits[1] = sc.nextInt();
        digits[2] = sc.nextInt();
        System.out.println("Combinations: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    if (i != j && j != k && k != i) {
                        System.out.print(digits[i] + "" + digits[j] + "" + digits[k]+ "\t");
                    }
                }
            }
        }
    }
}