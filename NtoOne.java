import java.util.Scanner;

public class NtoOne {
    public static void main(String[] args) {
        Scanner z = new Scanner(System.in);
        System.out.print("Enter a number to be decremented : ");
        int x = z.nextInt();
        for (int j = x; j > 0; j--) {
            System.out.print(j + " ");
        }
    }
}
