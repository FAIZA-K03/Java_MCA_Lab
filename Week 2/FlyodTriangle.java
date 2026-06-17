import java.util.Scanner;
public class FlyodTriangle {
    public static void main(String[] args) {
        int row;
        System.out.println("Enter number of row: ");
        Scanner sc = new Scanner(System.in);
        row = sc.nextInt();
        int num = 1;
        int i, j;
        System.out.println("Floyd's Triangle");
        for (i = 1; i <= row; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print(num + "\t");
                num++;
            }
            System.out.print("\n");
        }
        System.out.println("Alternating pattern");
        for (i = 1; i <= row; i++) {
            for (j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0)
                    System.out.print("1 \t");
                else
                    System.out.print("0 \t");
            }
            System.out.print("\n");
        }
    }
}