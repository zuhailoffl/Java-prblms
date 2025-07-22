import java.util.Scanner;

public class Divisibility {
    public static void main(String[] args) {
        Scanner z = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int a = z.nextInt();
        if (a % 5 == 0 && a % 11 == 0) {
            System.out.println("Divisibile by both 5 and 11");
        } else {
            System.out.print(a + " is not divisible by both");
        }

    }
}
