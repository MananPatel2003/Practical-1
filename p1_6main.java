
/*ID:21CE096
AIM: Given an array of strings, return a new array without the strings that are equal to
     the target string. One approach is to count the occurrences of the target string, make
     a new array of the correct length, and then copy over the correct strings.
 */
import java.util.Scanner;

public class p1_6main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] s = new String[6];
        String a1;
        System.out.println("Enter the array of string:");
        for (int i = 0; i < 6; i++) {
            s[i] = sc.next();
        }
        System.out.println("Enter string you want to remove: ");
        a1 = sc.next();
        p1_6 b = new p1_6(s, a1);
    }
}