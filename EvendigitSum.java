import java.util.Scanner;

public class EvendigitSum {
    public static void main(String[] args) {
        Scanner z = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int x = z.nextInt();
        int Evencount = 0;
        int Oddcount = 0;
        if (x % 2 == 0) {
            while (x > 0) {
                int last = x % 10;
                Evencount = Evencount + last;
                x = x / 10;
            }
            System.out.println("Even count is : " + Evencount);
        } else {
            while (x > 0) {
                int Last = x % 10;
                Oddcount = Oddcount + Last;
                x = x / 10;
            }
            System.out.println("Odd count is : " + Oddcount);
        }
    }
}
