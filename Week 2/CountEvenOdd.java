import java.util.Scanner;
public class CountEvenOdd {
    public static void main(String[] args) {
        System.out.println("Enter total: ");
        int size;
        Scanner sc = new Scanner(System.in);
        size = sc.nextInt();
        int evenCount = 0, oddCount = 0;
        int arr[] = new int[size];
        System.out.println("Enter numbers: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] % 2 == 0)
                evenCount++;
            else
                oddCount++;
        }
        System.out.println("Even count: " + evenCount);
        System.out.println("Odd count: " + oddCount);
    }
}