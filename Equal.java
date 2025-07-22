import java.util.Scanner;

public class Equal {
    public static void main(String[] args) {
        Scanner z = new Scanner(System.in);
        System.out.print("Enter num1 : ");
        int a = z.nextInt();
        System.out.print("Enter num2 : ");
        int b = z.nextInt();
        System.out.print("Enter num3 : ");
        int c = z.nextInt();
        if (a == b && b == c) {
            System.out.println("All are equal");
        } else if (a == b || b == c || a == c) {
            System.out.println("Any two values are equal");
        } else {
            System.out.println("No euquals");
        }
    }
}