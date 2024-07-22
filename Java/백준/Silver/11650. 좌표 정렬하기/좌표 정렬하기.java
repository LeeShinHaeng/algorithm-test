import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[][] nums = new int[size][2];
        for (int i = 0; i < size; i++) {
            nums[i][0] = scan.nextInt();
            nums[i][1] = scan.nextInt();
        }

        Arrays.sort(nums, (o1, o2) -> {
            if (o1[0] == o2[0]) {
                return o1[1] - o2[1];
            }
            return o1[0] - o2[0];
        });

        for (int i = 0; i < size; i++) {
            System.out.println(nums[i][0] + " " + nums[i][1]);
        }
    }
}