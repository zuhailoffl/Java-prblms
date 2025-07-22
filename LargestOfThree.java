import java.util.Scanner;

public class LargestOfThree {
    public static void main(String[] args) {
        Scanner z = new Scanner(System.in);
        System.out.println("Enter a num1 : ");
        int a = z.nextInt();
        System.out.println("Enter num2 : ");
        int b = z.nextInt();
        System.out.println("Enter num3 : ");
        int c = z.nextInt();
        if (a == b || b == c) {
            System.out.println("Same values");
        } else if (a > b) {
            System.out.println(a + " is greater");
        } else if (b > c) {
            System.out.println(b + " is greater");
        } else {
            System.out.println(c + " is greater");
        }
    }
}