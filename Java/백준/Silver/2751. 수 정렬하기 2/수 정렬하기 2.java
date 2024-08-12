import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        List<Integer> nums = new ArrayList<>();
        for (int i = 0; i < tc; i++) {
            nums.add(Integer.parseInt(br.readLine()));
        }
        Collections.sort(nums);
        StringBuilder sb = new StringBuilder();
        for (Integer num : nums) {
            sb.append(num).append("\n");
        }
        System.out.println(sb);
    }
}