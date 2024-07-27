import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HashMap<Character, Integer> map = new HashMap<>();
        Scanner scan = new Scanner(System.in);

        int[] nums = new int[3];
        for(int i = 0; i < 3; i++){
            nums[i] = scan.nextInt();
        }

        Arrays.sort(nums);
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < 3; i++){
            sb.append(nums[i]).append(" ");
        }
        System.out.println(sb);
    }
}