import java.util.Scanner;

public class Bot {
    public static void main(String[] args) {
        Scanner z = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int x = z.nextInt();
        boolean Prime = true;
        if (x <= 1) {
            System.out.print("Not a prime");
        }
        for (int i = 2; i <= Math.sqrt(x); i++) {
            if (x % i == 0) {
                Prime = false;
                break;
            }
        }
        if (Prime == false) {
            System.out.println("Not a prime");
        } else {
            System.out.println("Is a prime");
        }
    }
}