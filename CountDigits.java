import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner z = new Scanner(System.in);
        System.out.print("Enter a num : ");
        int x = z.nextInt();
        int count = 0;
        while (x > 0) {
            count++;
            x = x / 10;
        }
        System.out.println(count);
    }
}