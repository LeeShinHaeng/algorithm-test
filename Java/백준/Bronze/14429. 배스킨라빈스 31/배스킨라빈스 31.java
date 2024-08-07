import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int min = Integer.MAX_VALUE;
        int idx = 0;
        int tc = Integer.parseInt(br.readLine());

        for (int i = 0; i < tc; i++) {
            String[] input = br.readLine().split(" ");
            int j = Integer.parseInt(input[0]);
            int m = Integer.parseInt(input[1]);

            int tmp = 2 * ((j - 1) / (m + 1) + 1);
            if (min > tmp) {
                min = tmp;
                idx = i + 1;
            }

            if (tmp == 2) {
                break;
            }
        }
        System.out.println(idx + " " + min);
    }
}