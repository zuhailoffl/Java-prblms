import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner z = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int x = z.nextInt();
        int fact = 1;
        for (int i = x; i > 0; i--) {
            fact = fact * i;
        }
        System.out.print(fact);
    }
}