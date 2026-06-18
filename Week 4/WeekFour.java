/* Scenario: Basic Object-Oriented Concepts You are tasked with developing a simple Java
application that demonstrates basic object-oriented programming concepts such as classes, methods, encapsulation, and inheritance. Problems
Problem 1: Odd and Even Counter Scenario: You are working on a module for a school
project that counts the number of odd and even numbers entered by students during a
math quiz. The module should use a class OddAndEven to manage the count and a
TestOddAndEven class to test the functionality.
Problem 2: Circle Class Scenario: You need to develop a module for a geometry application
that calculates the area and perimeter of a circle. Additionally, the module should check if a
given point is inside the circle.
Problem 3: Text Analysis Scenario: You are tasked with writing a program for a text analysis
tool that counts the number of words, sentences, and occurrences of specific letters in a
given text.
Problem 4: Sales Commission Calculator Scenario: You need to develop a module for a sales
management application that calculates the commission based on sales figures. The
commission rates are as follows: ● Under 500: 2% of sales ● Between 500 and 5000: 5% of
sales ● 5000 and above: 8% of sales
*/
import java.util.Scanner;
import java.lang.Math;
public class WeekFour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the program no.: ");
        int prgm = sc.nextInt();
        if (prgm == 1) {
            OddAndEven obj1 = new OddAndEven();
            System.out.println("How many numbers you want to enter:");
            int k = sc.nextInt();
            int arr[] = new int[k];
            System.out.println("Enter the numbers: ");
            for (int i = 0; i< k; i++) {
                arr[i] = sc.nextInt();
            }
            obj1.check(arr);
            obj1.display();
        }
        else if (prgm == 2) {
            System.out.println("Enter the radius: ");
            double radius = sc.nextDouble();
            double area = 3.14 * radius * radius;
            double peri = 2 * 3.14 * radius;
            System.out.println("Enter the center: ");
            int x = sc.nextInt();
            int y = sc.nextInt();
            System.out.println("Enter the point: ");
            int h = sc.nextInt();
            int k = sc.nextInt();
            double dis = (x - h) * (x - h) + (y - k) * (y - k);
            System.out.println("Area: " + area);
            System.out.println("Perimeter: " + peri);
            dis = Math.sqrt(dis);
            if (dis < radius)
                System.out.println("Point (" + h + ", " + k + ") is inside the circle");
            else if (dis == radius)
                System.out.println("Point (" + h + ", " + k + ") is on the circle");
            else
                System.out.println("Point (" + h + ", " + k + ") is outside the circle");
        }
        else if (prgm==3) {
            sc.nextLine();
            System.out.println("Enter a sentence = ");
            String text = sc.nextLine();
            text = text.toLowerCase();
            System.out.println("Enter a character you want to check its occurrence = ");
            char target = sc.next().charAt(0);
            target = Character.toLowerCase(target);
            int WordCount = 0;
            int SentenceCount = 0;
            int CharacterCount = 0;
            for (int i = 0; i<text.length(); i++) {
                char ch = text.charAt(i);
                if (ch == ' ') {
                    WordCount++;
                }
                if (ch == '.' || ch == '!' || ch == '?') {
                    SentenceCount++;
                }
                if (ch == target) {
                    CharacterCount++;
                }
            }
            if (!text.isEmpty()) {
                WordCount = WordCount + 1;
            }
            System.out.println("Number of Words = " + WordCount);
            System.out.println("Number of Sentences = " + SentenceCount);
            System.out.println("Character " + target + " occurs " + CharacterCount + " times.");
        }
        else if (prgm == 4) {
            System.out.println("Enter Sales Amount = ");
            double sales = sc.nextDouble();
            CommissionCal obj4 = new CommissionCal();
            obj4.cal(sales);
        } else {
            System.out.println("invalid input!");
        }
    }
}
class OddAndEven {
    int oddCounter = 0, evenCounter = 0;
    void check(int arr[]) {
        for (int num :arr) {
            if (num % 2 == 0)
                evenCounter++;
            else
                oddCounter++;
        }
    }
    void display() {
        System.out.println("No. of even numbers: " + evenCounter);
        System.out.println("No. of odd numbers: " + oddCounter);
    }
}
class CommissionCal {
    double comm;
    void cal(double sales) {
        if (sales>0 && sales< 500) {
            comm = sales * 0.02;
            System.out.println("Commission = " + comm);
        } else if (sales >= 500 && sales < 5000) {
            comm = sales * 0.05;
            System.out.println("Commission = " + comm);
        } else if (sales >= 5000) {
            comm = sales * 0.08;
            System.out.println("Commission = " + comm);
        } else {
            System.out.println("Invalid input");
        }
    }
}