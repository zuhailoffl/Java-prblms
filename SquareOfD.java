import java.util.Scanner;

public class SquareOfD {
    public static void main(String[] args) {
        Scanner z = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int x = z.nextInt();
        int product = 0;
        while (x > 0) {
            int last = x % 10;
            int square = last * last;
            product = product + square;
            x = x / 10;
        }
        System.out.println(product);

    }
}
