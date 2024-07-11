import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        int[] inputs = new int[n];
        for (int i = 0; i < n; i++) {
            inputs[i] = Integer.parseInt(br.readLine());
        }

        int count = 1;
        int max = inputs[n - 1];

        for (int i = n - 1; i >= 0; i--) {
            if (max < inputs[i]) {
                max = inputs[i];
                count++;
            }
        }
        System.out.println(count);
    }
}