import java.util.Scanner;

public class SignCheck {
    public static void main(String[] args) {
        Scanner z = new Scanner(System.in);
        int a = z.nextInt();
        if (a > 0) {
            System.out.println(a + " " + "is positive ");
        } else if (a < 0) {
            System.out.println(a + " " + "is negative ");
        } else {
            System.out.println(a + " " + "Neutral");
        }
    }

}
