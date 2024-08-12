import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());

        int[] nums = new int[tc];
        for (int i = 0; i < tc; i++) {
            nums[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(nums);
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < tc; i++) {
            sb.append(nums[i]).append("\n");
        }
        System.out.println(sb);
    }
}