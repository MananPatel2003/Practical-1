
import java.util.Scanner;

public class p1_2main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        p1_2 a = new p1_2();
        System.out.println("Enter the string:");
        String S = s.nextLine();
        a.startOz(S);
    }
}