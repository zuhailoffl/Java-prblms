import java.util.Scanner;

public class ThreeDigit {
    public static void main(String[] args) {
        Scanner z = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int a = z.nextInt();
        if (a > 99 && a < 1000) {
            System.out.println(a + " " + "Yes, it is a three digit number ");
        } else {
            System.out.println(a + " " + "No, it is not a three digit number ");
        }
    }
}
