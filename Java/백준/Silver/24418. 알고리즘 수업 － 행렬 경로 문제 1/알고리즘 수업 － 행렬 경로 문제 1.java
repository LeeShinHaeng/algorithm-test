import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {
    static int countA;
    static int countB;
    static long[][] memo;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        long[][] matrix = new long[n][n];

        for (int i = 0; i < n; i++) {
            String[] s = br.readLine().split(" ");
            for (int j = 0; j < n; j++) {
                matrix[i][j] = Integer.parseInt(s[j]);
            }
        }

        countA = 0;
        countB = 0;
        memo = new long[n + 1][n + 1]; // 메모이제이션 배열 초기화
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n; j++) {
                memo[i][j] = -1; // -1로 초기화하여 방문 여부 체크
            }
        }

        matrix_path1(matrix, n);
        matrix_path2(matrix, n);

        System.out.println(countA + " " + countB);
    }

    static long matrix_path1(long[][] m, int n) {
        return matrix_path_rec(m, n, n);
    }

    static long matrix_path_rec(long[][] m, int i, int j) {
        if (i == 0 || j == 0) { // 기저 조건
            countA++;
            return 0;
        }

        return m[i - 1][j - 1] + Math.max(matrix_path_rec(m, i - 1, j), matrix_path_rec(m, i, j - 1));
    }

    static long matrix_path2(long[][] m, int n) {
        long[][] d = new long[n + 1][n + 1]; // DP 배열 생성

        for (int i = 1; i <= n; i++) {
            d[i][0] = 0;
        }
        for (int j = 1; j <= n; j++) {
            d[0][j] = 0;
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                countB++;
                d[i][j] = m[i - 1][j - 1] + Math.max(d[i - 1][j], d[i][j - 1]);
            }
        }

        return d[n][n];
    }
}
