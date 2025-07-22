import java.util.Scanner;

public class TotalWork {
    public static void main(String[] args) {
        Scanner z = new Scanner(System.in);
        System.out.println("E1 : ");
        int Energy1 = z.nextInt();
        System.out.println("T1");
        int Time1 = z.nextInt();
        System.out.println("E2 : ");
        int Energy2 = z.nextInt();
        System.out.println("T2 : ");
        int Time2 = z.nextInt();

        double Work1 = Energy1 / Time1;
        double work2 = Energy2 / Time2;
        System.out.printf("Total work is : " + (Work1 + work2), "%.2f");
    }
}