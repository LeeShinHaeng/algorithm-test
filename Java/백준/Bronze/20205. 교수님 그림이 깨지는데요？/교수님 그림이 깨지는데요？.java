import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        String[] size = br.readLine().split(" ");
        int n = Integer.parseInt(size[0]);
        int k = Integer.parseInt(size[1]);
        int[][] inputs = new int[n][n];

        for (int i = 0; i < n; i++) {
            String[] input = br.readLine().split(" ");
            for (int j = 0; j < n; j++) {
                inputs[i][j] = Integer.parseInt(input[j]);
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n * k; i++) {
            for (int j = 0; j < n * k; j++) {
                sb.append(inputs[i / k][j / k]).append(" ");
            }
            System.out.println(sb);
            sb.setLength(0);
        }
    }
}