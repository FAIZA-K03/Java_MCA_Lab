import java.lang.Math;

public class SquareCubeTable {
    public static void main(String[] args) {
        System.out.println("Num \t Square \t Cube");
        for (int i = 0; i < 5; i++) {
            System.out.println(i + 1 + "\t" + Math.pow((i + 1), 2) + "\t\t\t" + Math.pow((i + 1), 3));
        }
    }
}