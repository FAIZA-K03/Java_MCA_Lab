// Fibonacci Sequence: You are working on a module for a math tutorial application that calculates and prints the first m Fibonacci numbers using a do...while loop.

import java.util.Scanner;

public class FibSequence {
    public static void main(String[] args) {
        System.out.println("Enter n: ");
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int t1 = 0, t2 = 1, t3, i = 3;
        System.out.println("Fibonacci Sequence");
        if (n >= 1)
            System.out.print(t1 + "\t");
        if (n >= 2)
            System.out.print(t2 + "\t");
//note: we are using this condition as we are using do-while loop, it will run atleast once even if the condition is false
        if (n > 3) {
            do {
                t3 = t1 + t2;
                System.out.print(t3 + "\t");
                t1 = t2;
                t2 = t3;
                i++;
            } while (i <= n);
        }
    }
}