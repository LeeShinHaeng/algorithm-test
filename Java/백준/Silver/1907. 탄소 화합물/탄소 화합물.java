import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split("=");
        String[] left = s[0].split("\\+");

        int[][] nums = new int[3][3];
        nums[0] = calculate(left[0]);
        nums[1] = calculate(left[1]);
        nums[2] = calculate(s[1]);

        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                for (int k = 1; k <= 10; k++) {
                    if ((i * nums[0][0]) + (j * nums[1][0]) == (k * nums[2][0]) &&
                            (i * nums[0][1]) + (j * nums[1][1]) == (k * nums[2][1]) &&
                            (i * nums[0][2]) + (j * nums[1][2]) == (k * nums[2][2])) {
                        System.out.println(i + " " + j + " " + k);
                        return;
                    }
                }
            }
        }
    }

    private static int[] calculate(String s) {
        int[] result = new int[3];

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            switch (c) {
                case 'C':
                    if (i + 1 < s.length() && s.charAt(i + 1) >= '0' && s.charAt(i + 1) <= '9') {
                        result[0] += s.charAt(i + 1) - '0';
                        break;
                    }
                    result[0]++;
                    break;
                case 'H':
                    if (i + 1 < s.length() && s.charAt(i + 1) >= '0' && s.charAt(i + 1) <= '9') {
                        result[1] += s.charAt(i + 1) - '0';
                        break;
                    }
                    result[1]++;
                    break;
                case 'O':
                    if (i + 1 < s.length() && s.charAt(i + 1) >= '0' && s.charAt(i + 1) <= '9') {
                        result[2] += s.charAt(i + 1) - '0';
                        break;
                    }
                    result[2]++;
                    break;
            }
        }
        return result;
    }
}