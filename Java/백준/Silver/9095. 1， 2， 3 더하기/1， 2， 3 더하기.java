import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws Exception {
        int[] nums = new int[12];
        nums[0] = 0;
        nums[1] = 1;
        nums[2] = 2;
        nums[3] = 4;

        for (int i = 4; i < 12; i++) {
            nums[i] = nums[i - 3] + nums[i - 2] + nums[i - 1];
        }

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < tc; i++) {
            int n = Integer.parseInt(br.readLine());
            sb.append(nums[n]).append("\n");
        }
        System.out.println(sb);
    }
}