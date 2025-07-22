import java.util.Scanner;

public class ExactMultiple {
    public static void main(String[] args) {
        Scanner z = new Scanner(System.in);
        System.out.println("Enter a number1 : ");
        double n = z.nextDouble();
        System.out.println("Enter a number1 : ");
        double m = z.nextDouble();
        if (n % m == 0) {
            System.out.println("It is an exact multiple");
        } else {
            System.out.println("Not an exact multiple and the value is " + n % m);
        }
    }
}
