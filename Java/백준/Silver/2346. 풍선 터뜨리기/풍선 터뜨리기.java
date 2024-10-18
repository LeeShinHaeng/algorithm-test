import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        ArrayDeque<int[]> deque = new ArrayDeque<>();
        for (int i = 1; i <= n; i++) {
            deque.add(new int[]{i, Integer.parseInt(st.nextToken())});
        }

        StringBuilder sb = new StringBuilder();
        int[] current = deque.pollFirst();
        sb.append(current[0]).append(" ");
        int move = current[1];

        while (!deque.isEmpty()) {
            if (move > 0) {
                for (int i = 0; i < move - 1; i++) {
                    deque.add(deque.pollFirst());
                }
                current = deque.pollFirst();
            } else {
                for (int i = 0; i < Math.abs(move) - 1; i++) {
                    deque.addFirst(deque.pollLast());
                }
                current = deque.pollLast();
            }

            sb.append(current[0]).append(" ");
            move = current[1];
        }

        System.out.println(sb);
    }
}