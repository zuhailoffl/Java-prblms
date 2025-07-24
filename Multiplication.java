import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
        Scanner z = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int x = z.nextInt();
        for (int i = 1; i <= 12; i++) {
            System.out.println(x + "x" + i + "=" + i * x);
        }
    }
}
