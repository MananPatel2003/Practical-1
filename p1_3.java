import java.util.Scanner;

public class p1_3 {
    public static void main(String[] args) {
        int x, y;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter first number:");
        x = s.nextInt();
        System.out.println("Enter Second number:");
        y = s.nextInt();
        int a = 0;
        int b = 0;
        while (x != 0) {
            a = x % 10;
            x = x / 10;
        }
        while (y != 0) {
            b = y % 10;
            y = y / 10;
        }
        if (a == b) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}