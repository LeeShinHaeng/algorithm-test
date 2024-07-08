import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static int[] nums;

    public static void main(String[] args) throws IOException {
        int size = Integer.parseInt(br.readLine());
        System.out.println(size);

        nums = new int[size];
        nums[0] = 1;
        nums[1] = 2;
        int tmp = 3;
        for (int i = 2; i < size - 1; i++) {
            nums[i] = tmp++;
        }

        while (true) {
            tmp += 1;
            if (isPrime(tmp)) {
                nums[size - 1] = tmp;
                break;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            sb.append(nums[i]).append(" ");
        }
        sb.deleteCharAt(sb.length() - 1);
        System.out.println(sb.toString());
    }

    private static boolean isPrime(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}