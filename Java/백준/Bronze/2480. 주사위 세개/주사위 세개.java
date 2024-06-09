import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(threeDice());
    }

    public static int threeDice() {
        Scanner scanner = new Scanner(System.in);
        int[] nums = new int[3];
        for (int i = 0; i < 3; i++) {
            nums[i] = scanner.nextInt();
        }

        Arrays.sort(nums);

        if (nums[0] == nums[2]) {
            return 10_000 + nums[0] * 1_000;
        } else if (nums[0] == nums[1] || nums[1] == nums[2]) {
            return 1_000 + nums[1] * 100;
        } else {
            return nums[2] * 100;
        }
    }
}