import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static boolean[] prime;

    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        String[] input = br.readLine().split(" ");
        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);

        primeNumber(b);

        for (int i = a; i <= b; i++) {
            if (!prime[i]) {
                sb.append(i).append("\n");
            }
        }
        System.out.println(sb);
    }

    private static void primeNumber(int max) {
        prime = new boolean[max + 1];
        prime[0] = prime[1] = true;
        for (int i = 2; i <= Math.sqrt(max); i++) {
            if (prime[i]) {
                continue;
            }
            for (int j = i * i; j <= max; j += i) {
                prime[j] = true;
            }
        }
    }
}