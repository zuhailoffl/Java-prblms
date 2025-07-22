import java.util.Scanner;

public class OddOrEve {
    public static void main(String[] args) {
        Scanner z = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int a = z.nextInt();
        String s = a % 2 == 0 ? a + " " + "is Even" : a + " " + "is Odd";
        System.out.println(s);
    }
}
