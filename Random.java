import java.util.Scanner;

public class Random {
    public static void main(String[] args) {
        Scanner z = new Scanner(System.in);
        System.out.println("Enter the numbers");
        int a = z.nextInt();
        int b = z.nextInt();
        int c = z.nextInt();
        int d = z.nextInt();
        int e = z.nextInt();
        int zuh[] = { a, b, c, d, e };
        int oddcount = 0;
        int evencount = 0;
        for (int j : zuh) {
            if (j % 2 == 0) {
                evencount++;
            } else {
                oddcount++;
            }
        }
        System.out.println("even count : " + evencount);
        System.out.println("odd count : " + oddcount);
    }

}
