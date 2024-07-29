import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int k = Integer.parseInt(s[0]);
        int size = Integer.parseInt(s[1]);
        int[] nums = new int[k];
        s = br.readLine().split(" ");

        int max = Integer.MIN_VALUE;
        int sum = 0;

        for (int i = 0; i < k; i++) {
            nums[i] = Integer.parseInt(s[i]);
            if (i - size + 1 < 0) {
                continue;
            }
            for (int j = i; j > i - size; j--) {
                sum += nums[j];
            }

            max = Math.max(max, sum);
            sum = 0;
        }
        System.out.println(max);
    }
}