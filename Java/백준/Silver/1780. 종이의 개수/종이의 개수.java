import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int size;
    static int MINUS = 0;
    static int ZERO = 0;
    static int PLUS = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        size = Integer.parseInt(br.readLine());
        int[][] arr = new int[size][size];
        for (int i = 0; i < size; i++) {
            String[] input = br.readLine().split(" ");
            for (int j = 0; j < size; j++) {
                arr[i][j] = Integer.parseInt(input[j]);
            }
        }

        cutting(arr, size / 3);
        System.out.println(MINUS);
        System.out.println(ZERO);
        System.out.println(PLUS);
    }

    private static void cutting(int[][] arr, int n) {
        if (check(arr)) {
            return;
        }
        for (int rowBlock = 0; rowBlock < 3; rowBlock++) {
            for (int colBlock = 0; colBlock < 3; colBlock++) {
                int[][] subArray = new int[n][n];
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        subArray[i][j] = arr[rowBlock * n + i][colBlock * n + j];
                    }
                }
                cutting(subArray, n / 3);
            }
        }
    }

    private static boolean check(int[][] arr) {
        boolean minus = false, zeros = false, plus = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == 0) {
                    zeros = true;
                } else if (arr[i][j] == 1) {
                    plus = true;
                } else {
                    minus = true;
                }

                if ((zeros && plus) || (minus && plus) || (zeros && minus)) {
                    return false;
                }
            }
        }
        if (minus) MINUS++;
        if (zeros) ZERO++;
        if (plus) PLUS++;
        return true;
    }
}