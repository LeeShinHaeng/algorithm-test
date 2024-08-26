import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        Queue<String> queue = new LinkedList<>();
        Queue<Integer> nums = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            String[] s = br.readLine().split(" ");
            queue.add(s[0]);
            nums.add(Integer.parseInt(s[1]));
        }

        while (queue.size() > 1) {
            queue.poll();
            int pass = (nums.poll() - 1) % queue.size();
            for(int i = 0; i < pass; i++) {
                queue.add(queue.poll());
                nums.add(nums.poll());
            }
            queue.poll();
            nums.poll();
        }

        System.out.println(queue.poll());
    }
}