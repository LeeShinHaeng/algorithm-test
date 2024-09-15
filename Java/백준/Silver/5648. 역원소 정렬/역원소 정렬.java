import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

// https://www.acmicpc.net/problem/5648
class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split("\\s+");
        int tc = Integer.parseInt(s[0]);
        long[] nums = new long[tc];
        int count = 0;

        for (int i = 1; i < s.length; i++) {
            if (!s[i].isEmpty()) {  // 빈 문자열이 아닌 경우에만 처리
                nums[count++] = reversing(s[i]);
            }
        }

        while (count < tc) {
            s = br.readLine().split("\\s+");
            for (String string : s) {
                if (!string.isEmpty()) {  // 빈 문자열이 아닌 경우에만 처리
                    nums[count++] = reversing(string);
                }
            }
        }

        Arrays.sort(nums);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < tc; i++) {
            sb.append(nums[i]).append("\n");
        }
        System.out.println(sb);
    }

    private static long reversing(String s) {
        String trimmed = s.replaceAll("0+$", "");
        String reversed = new StringBuilder(trimmed).reverse().toString();
        return Long.parseLong(reversed);
    }
}
