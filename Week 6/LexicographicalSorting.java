/*Lexicographical Sorting
Scenario: You are working on a module for a text analysis tool that reads three strings and
sorts them lexicographically*/

import java.util.Arrays;
import java.util.Scanner;

public class LexicographicalSorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] arr = new String[3];
        System.out.println("Enter three strings:");

        for(int i = 0; i < 3; i++) {
            arr[i] = sc.nextLine();
        }

        Arrays.sort(arr);

        System.out.println("Sorted Strings:");
        for(String s : arr) {
            System.out.print(s + " ");
        }
        sc.close();
    }
}