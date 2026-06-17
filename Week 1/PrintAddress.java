import java.util.Scanner;
public class PrintAddress {
    public static void main(String[] args) {
        String add;
        System.out.print("Enter address: ");
        Scanner sc = new Scanner(System.in);
        add = sc.nextLine();
        System.out.println("Address is: " + add);
    }
}