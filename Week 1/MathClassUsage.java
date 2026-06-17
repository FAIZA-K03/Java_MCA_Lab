import java.util.Scanner;
import java.lang.Math;

public class MathClassUsage {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int num;
        num = sc.nextInt();
        System.out.println("Absolute: " + Math.abs(num));
        System.out.println("Square Root: " + Math.sqrt(+Math.abs(num)));
        System.out.println("Power(num^2): " + Math.pow(num, 2));
        System.out.println("Sine value: " + Math.sin(num));
        System.out.println("Cosine value: " + Math.cos(num));
    }
}