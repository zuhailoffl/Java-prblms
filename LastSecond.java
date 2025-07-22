import java.util.Scanner;

public class LastSecond {
    public static void main(String[] args) {
        Scanner z = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int a = z.nextInt();
        int b = a / 10;
        int second = b % 10;
        System.out.println("Last second num is : " + second);
    }
}
