import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int n = Integer.parseInt(s[0]);
        int m = Integer.parseInt(s[1]);
        int k = Integer.parseInt(s[2]);

        double result = 0.0;
        double bunmo = combination(n, m);


        while (m >= k) {
            // combination(n - m, m - k)를 못하는 경우 
            if (m - k > n - m) {
                k++;
                continue;
            }

            double bunja = combination(m, k) * combination(n - m, m - k);

            result += bunja / bunmo;
            k++;
        }

        System.out.println(result);
    }

    private static double combination(int n, int m) {
        return (double) factorial(n) / (factorial(m) * (factorial(n - m)));
    }

    private static int factorial(int n) {
        if (n <= 1) return 1;
        return n * factorial(n - 1);
    }
}