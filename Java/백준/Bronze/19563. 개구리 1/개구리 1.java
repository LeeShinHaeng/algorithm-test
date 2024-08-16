import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int x = Integer.parseInt(s[0]);
        int y = Integer.parseInt(s[1]);
        int c = Integer.parseInt(s[2]);

        x = Math.abs(x);
        y = Math.abs(y);

        if ((x + y) % 2 != c % 2) {
            System.out.println("NO");
            return;
        }

        if (x + y > c) {
            System.out.println("NO");
            return;
        }

        System.out.println("YES");
    }
}