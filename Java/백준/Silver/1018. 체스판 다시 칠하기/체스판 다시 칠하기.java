import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class Main {
    static boolean[][] matrix;
    static int min = 32;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] size = br.readLine().split(" ");
        int n = Integer.parseInt(size[0]);
        int m = Integer.parseInt(size[1]);
        matrix = new boolean[n][m];

        for (int i = 0; i < n; i++) {
            String[] input = br.readLine().split("");
            for (int j = 0; j < m; j++) {
                if (input[j].charAt(0) == 'B') {
                    matrix[i][j] = true;
                } else {
                    matrix[i][j] = false;
                }
            }
        }

        for (int i = 0; i < (n - 7); i++) {
            for (int j = 0; j < (m - 7); j++) {
                checkColoring(i, j);
            }
        }
        System.out.println(min);
    }

    private static void checkColoring(int x, int y) {
        int endX = x + 8;
        int endY = y + 8;
        int count = 0;

        boolean charAt = matrix[x][y];
        for (int i = x; i < endX; i++) {
            for (int j = y; j < endY; j++) {
                if (matrix[i][j] != charAt) {
                    count++;
                }
                charAt = !charAt;
            }
            charAt = !charAt;
        }
        count = Math.min(count, 64 - count);
        min = Math.min(min, count);
    }
}