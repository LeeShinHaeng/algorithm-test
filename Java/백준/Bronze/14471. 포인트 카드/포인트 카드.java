import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int n = Integer.parseInt(s[0]);
        int m = Integer.parseInt(s[1]);

        ArrayList<Integer> nums = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            s = br.readLine().split(" ");
            int a = Integer.parseInt(s[0]);
            if (a < n) {
                nums.add(a);
            }
        }

        Collections.sort(nums, Collections.reverseOrder());

        if (!nums.isEmpty()) {
            nums.remove(nums.size() - 1);
        }

        int count = 0;
        for (Integer num : nums) {
            count += n - num;
        }
        System.out.println(count);
    }
}