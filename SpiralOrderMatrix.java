import java.util.*;

public class SpiralOrderMatrix {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int matrix[][] = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        int rstart = 0;
        int rend = n - 1;
        int cstart = 0;
        int cend = m - 1;

        while (rstart <= rend && cstart <= cend) {
            // logic 1
            for (int c = cstart; c <= cend; c++) {
                System.out.print(matrix[rstart][c] + " ");
            }
            rstart++;
            // 2
            for (int r = rstart; r <= rend; r++) {
                System.out.print(matrix[r][cend] + " ");
            }
            cend--;
            // 3
            for (int c = cend; c >= cstart; c--) {
                System.out.print(matrix[rend][c] + " ");
            }
            rend--;
            // 4
            for (int r = rend; r >= rstart; r--) {
                System.out.print(matrix[r][cstart] + " ");
            }
            cstart++;
            System.out.println();
        }

    }
}
