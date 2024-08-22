import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] s = br.readLine().split(" ");
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            int tmp = Integer.parseInt(s[i]);
            if (tmp > max) {
                max = tmp;
            }
            if (tmp < min) {
                min = tmp;
            }
        }

        System.out.println(min + " " + max);
    }
}