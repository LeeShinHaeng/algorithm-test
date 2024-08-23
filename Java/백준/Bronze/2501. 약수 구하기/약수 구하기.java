import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int n = Integer.parseInt(s[0]);
        int k = Integer.parseInt(s[1]);
        int factor = 1;
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                factor = i;
                count++;
            }
            if (count == k) {
                System.out.println(factor);
                return;
            }
        }

        System.out.println(0);
    }
}