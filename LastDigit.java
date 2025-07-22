import java.util.Scanner;

public class LastDigit {
    public static void main(String[] args) {
        Scanner z = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int a = z.nextInt();
        int last = a % 10;
        System.out.println("Last digit is " + last);
    }
}
