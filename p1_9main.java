
/*ID:21CE096
AIM: The problem is to check whether a given Sudoku solution is correct.
 */
import java.util.Scanner;

public class p1_9main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Sudoku Solution:");
        int a1[][] = new int[9][9];
        int a2[][] = new int[9][9];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                a1[i][j] = s.nextInt();
                a2[i][j] = a1[i][j];
            }
        }
        p1_9 x = new p1_9();
        x.Sudoku(a1, a2);
    }
}