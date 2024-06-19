import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static Integer[][] dp;
    static int[] weight;
    static int[] value;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        weight = new int[n];
        value = new int[n];

        dp = new Integer[n][k + 1];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            weight[i] = Integer.parseInt(st.nextToken());
            value[i] = Integer.parseInt(st.nextToken());
        }

        System.out.println(knapsack(n - 1, k));
    }

    static int knapsack(int i, int k) {
        if (i < 0) {
            return 0;
        }
        if (dp[i][k] != null) {
            return dp[i][k];
        }

        if (weight[i] > k) {
            dp[i][k] = knapsack(i - 1, k);
        } else {
            dp[i][k] = Math.max(knapsack(i - 1, k), knapsack(i - 1, k - weight[i]) + value[i]);
        }

        return dp[i][k];
    }
}