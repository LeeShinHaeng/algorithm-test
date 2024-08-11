import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int n = Integer.parseInt(s[0]);
        int r = Integer.parseInt(s[1]);

        System.out.println(factorial(n) / (factorial(r) * factorial(n - r)));
    }

    private static int factorial(int i) {
        if (i <= 1) return 1;
        return i * factorial(i - 1);
    }
}