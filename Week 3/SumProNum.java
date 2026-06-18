/* Sum and Product of Numbers
Scenario: You are tasked with writing a program that prompts the user to enter 4 numbers, then
computes and displays their sum and product for a financial analysis tool.*/
import java.util.Scanner;

public class SumProNum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[4];   // Array of size 4
        int sum = 0;
        int product = 1;
        System.out.println("Enter 4 numbers:");
        for(int i = 0; i < 4; i++) {
            num[i] = sc.nextInt();
        }
        for(int i = 0; i < 4; i++) {
            sum += num[i];
            product *= num[i];
        }
        System.out.println("Sum: " + sum);
        System.out.println("Product: " + product);
    }
}