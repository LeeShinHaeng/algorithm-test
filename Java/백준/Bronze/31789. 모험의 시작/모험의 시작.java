import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] str = br.readLine().split(" ");
        int x = Integer.parseInt(str[0]);
        int s = Integer.parseInt(str[1]);

        for (int i = 0; i < n; i++) {
            str = br.readLine().split(" ");
            int c = Integer.parseInt(str[0]);
            if (c > x) {
                continue;
            }

            int p = Integer.parseInt(str[1]);
            if (p > s) {
                System.out.println("YES");
                return;
            }
        }
        System.out.println("NO");
    }
}
