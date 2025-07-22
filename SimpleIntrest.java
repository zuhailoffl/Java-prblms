import java.util.Scanner;

public class SimpleIntrest {
    public static void main(String[] args) {
        Scanner z = new Scanner(System.in);
        System.out.println("Enter principal : ");
        double Principal = z.nextDouble();
        System.out.println("Enter rate of intrest : ");
        double RateOfIntrest = z.nextDouble();
        System.out.println("Enter time in years : ");
        double Time = z.nextDouble();

        double SI = (Principal * RateOfIntrest * Time) / 100;
        System.out.printf("%.2f", SI);
    }
}
