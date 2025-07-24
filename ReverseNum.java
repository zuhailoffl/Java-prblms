import java.util.Scanner;

public class ReverseNum {
    public static void main(String[] args) {
        Scanner z = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int x = z.nextInt();
        int last = 0;
        while (x > 0) {
            last = x % 10;
            x = x / 10;
            System.out.print(last);
        }
    }
}
