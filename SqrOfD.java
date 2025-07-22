import java.util.Scanner;

public class SqrOfD {
    public static void main(String[] args) {
        Scanner z = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int x = z.nextInt();
        int a = x % 10;
        int b = x / 10;
        int b1 = b % 10;
        int c = b / 10;
        int c1 = c % 10;
        int d = c / 10;
        int d1 = d % 10;
        System.out.println(a * a + b1 * b1 + c1 * c1 + d1 * d1);

    }
}
