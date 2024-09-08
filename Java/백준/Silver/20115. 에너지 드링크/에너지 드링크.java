import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        String[] s = br.readLine().split(" ");
        Integer[] nums = new Integer[tc];
        for (int i = 0; i < tc; i++) {
            nums[i] = Integer.parseInt(s[i]);
        }
        Arrays.sort(nums);

        double result = nums[tc - 1];

        for (int i = 0; i < tc - 1; i++) {
            result += (double) nums[i] / 2;
        }

        System.out.println(result);
    }
}