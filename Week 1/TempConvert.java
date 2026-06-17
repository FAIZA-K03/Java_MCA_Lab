import java.util.Scanner;

public class TempConvert {
    public static void main(String[] args) {
        System.out.println("Enter total: ");
        int total;
        Scanner sc = new Scanner(System.in);
        total = sc.nextInt();
        float fah[] = new float[total];
        float cel[] = new float[total];
        System.out.println("Enter the temperature in fahrenheit: ");
        for (int i = 0; i < total; i++) {
            fah[i] = sc.nextFloat();
            cel[i] = (fah[i] - 32) / 1.8f;
        }
        System.out.println("S.No. \t Input(Fahrenheit)  \t Output(Celsius) ");
        for (int i = 0; i < total; i++) {
            System.out.println(+i + 1 + "\t" + fah[i] + "\t\t\t" + cel[i]);
        }
    }
}