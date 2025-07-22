import java.util.Scanner;

public class LargestOfTwo {
    public static void main(String[] args) {
        Scanner z = new Scanner(System.in);
        System.out.println("Enter a num1 : ");
        int a = z.nextInt();
        System.out.println("Enter num2 : ");
        int b = z.nextInt();
        if (a == b) {
            System.out.println("Same values");
        } else {
            String s = a > b ? a + "" + " is greater " : b + "" + " is greater ";
            System.out.println(s);
        }
    }
}