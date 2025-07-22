import java.util.Scanner;

public class SqrtOfNum {
    public static void main(String[] args) {
        Scanner z = new Scanner(System.in);
        System.out.println("Enter a number to be (sqrt and cbrt)'ed : ");
        double x = z.nextDouble();
        double y = z.nextDouble();
        double a = Math.sqrt(x);
        double b = Math.cbrt(y);
        System.out.printf("%.2f", a);
        System.out.println("");
        System.out.printf("%.2f", b);
    }
}