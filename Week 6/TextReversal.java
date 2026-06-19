/*Text Reversal
Scenario:You are working on a text processing module for a language learning application.
The module should read a sentence from the user and print it out with each word
reversed, but with the words and punctuation in the original order*/

import java.util.Scanner;

public class TextReversal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a sentence:");
        String input = sc.nextLine();

        String[] words = input.split(" ");
        
        String result = "" ;

        for (String word : words) {
            String reversed = "";
            
            for (int i = word.length() - 1; i >= 0; i--) {
                reversed += word.charAt(i);
            }
            
            result += reversed + " ";
        }

        System.out.println(result.trim());
        
        sc.close();
    }
}