import java.util.Scanner;

public class WheatStone {
    public static void main(String[] args) {
        Scanner z = new Scanner(System.in);
        System.out.print("Enter r1 : ");
        double r1 = z.nextDouble();
        System.out.print("Enter r2 : ");
        double r2 = z.nextDouble();
        System.out.print("Enter r3 : ");
        double r3 = z.nextDouble();
        double r4;
        double a = r3 * r2;
        r4 = a / r1;
        System.out.printf("r4 = %.2f\n", r4);
    }
}
