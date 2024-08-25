import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int r = Integer.parseInt(s[0]);
        int c = Integer.parseInt(s[1]);

        int[][] arr = new int[r][c];

        for (int i = 0; i < r; i++) {
            s = br.readLine().split(" ");
            for (int j = 0; j < c; j++) {
                arr[i][j] = Integer.parseInt(s[j]);
            }
        }

        int t = Integer.parseInt(br.readLine());
        int count = 0;

        int[] subArray = new int[9];
        int idx = 0;
        for (int i = 0; i <= r - 3; i++) {
            for (int j = 0; j <= c - 3; j++) {
                for (int x = i; x < i + 3; x++) {
                    for (int y = j; y < j + 3; y++) {
                        subArray[idx++] = arr[x][y];
                    }
                }
                if (findMid(subArray) >= t) {
                    count += 1;
                }
                idx = 0;
            }
        }
        System.out.println(count);
    }

    private static int findMid(int[] arr) {
        Arrays.sort(arr);
        return arr[4];
    }
}