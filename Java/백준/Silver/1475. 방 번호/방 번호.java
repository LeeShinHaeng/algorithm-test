import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] count = new int[10];

        while (n > 0) {
            count[n % 10]++;
            n /= 10;
        }

        double count69 = count[6] + count[9];
        int max = (int) Math.ceil(count69 / 2);
        for (int i = 0; i <= 9; i++) {
            if (i == 6 || i == 9) {
                continue;
            }
            if (count[i] > max) {
                max = count[i];
            }
        }

        System.out.println(max);
    }
}