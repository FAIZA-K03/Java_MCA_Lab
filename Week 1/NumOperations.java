import java.util.Scanner;
//import java.lang.Math;

public class NumOperations {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        float num;
        Scanner sc = new Scanner(System.in);
        num = sc.nextFloat();
        System.out.println("Num: " + num);
        System.out.println("Round: " + Math.round(num));
        System.out.println("Ceil: " + Math.ceil(num));
        System.out.println("Floor: " + Math.floor(num));
        int integer = (int) num;
        System.out.println("Integer: " + integer);
    }
}