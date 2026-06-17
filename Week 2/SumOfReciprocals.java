import java.util.Scanner;
public class SumOfReciprocals {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        int num;
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        float sum = 0.0f;
        for (int i = 1; i <= num; i++) {
            sum += 1.0 / i;
        }
        System.out.println("Sum of Reciprocals: " + sum);
    }
}