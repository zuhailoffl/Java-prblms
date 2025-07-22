import java.util.Scanner;

public class SumOfNum {
    public static void main(String[] args) {
        Scanner z = new Scanner(System.in);
        System.out.println("value of x : ");
        int x = z.nextInt();
        System.out.println("value of y : ");
        int y = z.nextInt();

        int sum = x + y;
        System.out.println("summed value : ");
        System.out.println(sum);
    }
}