import java.io.*;

public class Main {
    static long[][] dp = new long[30][30];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int tc = Integer.parseInt(br.readLine());
        for (int i = 0; i < tc; i++) {
            String[] number = br.readLine().split(" ");
            int n = Integer.parseInt(number[0]);
            int m = Integer.parseInt(number[1]);
            bw.write(combination(m, n) + "\n");
        }
        bw.flush();
    }

    private static long combination(int n, int r) {
        if(dp[n][r] > 0) {
            return dp[n][r];
        }

        if(n == r || r == 0) {
            return dp[n][r] = 1;
        }

        return dp[n][r] = combination(n - 1, r - 1) + combination(n - 1, r);
    }
}