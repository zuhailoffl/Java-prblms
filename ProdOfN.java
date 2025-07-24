import java.util.Scanner;

public class CountDigit {
    public static void main(String[] args) {
        Scanner z = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int x = z.nextInt();
        int product = 1;
        x = Math.abs(x);
        if (x == 0) {
            System.out.println(0);
        } else {
            while (x > 0) {
                int last = x % 10;
                product = product * last;
                x = x / 10;
            }
            System.out.print(product);
        }

    }
}
