import java.util.Scanner;
public class SumEvenNumbers {
    public static void main(String[] args) {
        System.out.println("Enter num:");
        int num;
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        int sumEven = 0;
        for (int i = 2; i <= num; i++) {
            if (i % 2 == 0) {
                sumEven = sumEven + i;
            }
        }
        System.out.println("Output: " + sumEven);
    }
}