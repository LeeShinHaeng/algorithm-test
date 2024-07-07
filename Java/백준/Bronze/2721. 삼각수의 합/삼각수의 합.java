import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int size = Integer.parseInt(br.readLine());
        for (int i = 0; i < size; i++) {
            System.out.println(triangularNumber(Integer.parseInt(br.readLine())));
        }
    }

    private static long triangularNumber(int n) {
        long sum = 0;
        for (int k = 1; k <= n; k++) {
            sum += k * sigma(k + 1);
        }
        return sum;
    }

    private static long sigma(int n) {
        if (n <= 1) {
            return 1;
        }
        return n + sigma(n - 1);
    }
}