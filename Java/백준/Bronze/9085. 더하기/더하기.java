import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        // 9085
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        for (int i = 0; i < tc; i++) {
            int n = Integer.parseInt(br.readLine());
            String[] s = br.readLine().split(" ");
            int sum = 0;
            for (int j = 0; j < n; j++) {
                sum += Integer.parseInt(s[j]);
            }
            System.out.println(sum);
        }
    }
}