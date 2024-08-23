import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int tc = Integer.parseInt(br.readLine());
        for (int i = 0; i < tc; i++) {
            long n = Long.parseLong(br.readLine());

            while (true) {
                if (isPrime(n)) {
                    sb.append(n).append("\n");
                    break;
                }
                n++;
            }
        }
        System.out.println(sb);
    }

    private static boolean isPrime(long n) {
        if (n == 0 || n == 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}