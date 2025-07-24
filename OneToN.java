import java.util.Scanner;

public class OneToN {
    public static void main(String[] args) {
        Scanner z = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int x = z.nextInt();
        for (int i = 1; i <= x; i++) {
            System.out.print(i + " ");
        }
    }
}
