import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            String[] s = br.readLine().split(" ");
            for (int j = 0; j < s.length; j++) {
                arr[i][j] = Integer.parseInt(s[j]);
            }
        }

        if (n == 1) {
            System.out.println(arr[0][0]);
            return;
        }

        int tc = Integer.parseInt(br.readLine());
        for (int i = 0; i < tc; i++) {
            String[] s = br.readLine().split(" ");

            if (s[0].equals("2")) {
                int[][] tmp = new int[n][n];

                for (int j = 0; j < n; j++) {
                    for (int k = 0; k < n; k++) {
                        tmp[k][n - 1 - j] = arr[j][k];
                    }
                }

                arr = tmp;
                continue;
            }

            int row = Integer.parseInt(s[1]) - 1;
            int tmp = arr[row][n - 1];
            int[] restOfArr = Arrays.copyOfRange(arr[row], 0, n - 1);

            arr[row][0] = tmp;
            for (int j = 0; j < restOfArr.length; j++) {
                arr[row][j + 1] = restOfArr[j];
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}