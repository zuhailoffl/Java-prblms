import java.util.Scanner;

public class FirstLast {
    public static void main(String[] args) {
        Scanner z = new Scanner(System.in);
        System.out.print("Enter four digit number : ");
        int x = z.nextInt();
        int Last = x % 10;
        int l2 = x / 10;
        int l3 = l2 / 10;
        int l4 = l3 / 10;
        System.out.println((Last + l4));
    }
}
