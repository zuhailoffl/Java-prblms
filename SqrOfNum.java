import java.util.Scanner;

public class SqrOfNum {
    public static void main(String[] args) {
        Scanner z = new Scanner(System.in);
        System.out.println("Enter number to be squared : ");
        int num = z.nextInt();
        int sqr = num * num;
        System.out.println(sqr);
    }
}