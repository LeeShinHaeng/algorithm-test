import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int[] nums = new int[5];
        for (int i = 0; i < 5; i++) {
            nums[i] = Integer.parseInt(s[i]);
        }

        int[] arr = new int[10];
        int idx = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = i + 1; j < 4; j++) {
                for (int k = j + 1; k < 5; k++) {
                    arr[idx] = lcm(nums[i], nums[j], nums[k]);
                    idx++;
                }
            }
        }

        Arrays.sort(arr);
        System.out.println(arr[0]);
    }

    private static int lcm(int a, int b, int c) {
        int x = lcm2(a, b);
        int y = lcm2(b, c);
        return lcm2(x, y);
    }

    private static int lcm2(int a, int b) {
        return a * b / gcd(a, b);
    }


    private static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
}