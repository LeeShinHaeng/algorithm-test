import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String[] condition = br.readLine().split(" ");
        int n = Integer.parseInt(condition[0]);
        int m = Integer.parseInt(condition[1]);
        int[] balls = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            balls[i] = i;
        }

        for (int i = 0; i < m; i++) {
            String[] input = br.readLine().split(" ");
            int a = Integer.parseInt(input[0]);
            int b = Integer.parseInt(input[1]);

            int tmp = balls[a];
            balls[a] = balls[b];
            balls[b] = tmp;
        }

        for (int i = 1; i <= n; i++) {
            sb.append(balls[i]).append(" ");
        }
        System.out.println(sb.deleteCharAt(sb.length() - 1));
    }
}