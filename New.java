import java.util.Scanner;

public class New {
    public static void main(String[] args) {
        Scanner z = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int x = z.nextInt();
        int count = 0;
        if (x <= 1) {
            System.out.print("Not a prime");
        }
        for (int i = 1; i <= x; i++) {
            if (x % i == 0) {
                count++;
                System.out.print(i);
            }
        }
        if (count == 2) {
            System.out.print("It is a prime number ");
        } else {
            System.out.print("Not a prime number ");
        }

    }
}
