import java.util.Scanner;

public class Farenheit {
    public static void main(String[] args) {
        Scanner z = new Scanner(System.in);
        System.out.println("Enter farenheit : ");
        double faren = z.nextDouble();
        double celcius = (faren - 32) * 5 / 9;
        System.out.printf("celcius : " + "%.3f", celcius);
    }
}
