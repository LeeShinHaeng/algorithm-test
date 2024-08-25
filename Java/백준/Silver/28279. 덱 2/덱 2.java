import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());

        List<Integer> deque = new LinkedList<>();
        for (int i = 0; i < tc; i++) {
            String[] s = br.readLine().split(" ");
            int command = Integer.parseInt(s[0]);

            switch (command) {
                case 1:
                    deque.add(0, Integer.parseInt(s[1]));
                    break;
                case 2:
                    deque.add(Integer.parseInt(s[1]));
                    break;
                case 3:
                    if (deque.isEmpty()) {
                        System.out.println(-1);
                        break;
                    }
                    System.out.println(deque.get(0));
                    deque.remove(0);
                    break;
                case 4:
                    if (deque.isEmpty()) {
                        System.out.println(-1);
                        break;
                    }
                    System.out.println(deque.get(deque.size() - 1));
                    deque.remove(deque.size() - 1);
                    break;
                case 5:
                    System.out.println(deque.size());
                    break;
                case 6:
                    if (deque.isEmpty()) {
                        System.out.println(1);
                        break;
                    }
                    System.out.println(0);
                    break;
                case 7:
                    if (deque.isEmpty()) {
                        System.out.println(-1);
                        break;
                    }
                    System.out.println(deque.get(0));
                    break;
                case 8:
                    if (deque.isEmpty()) {
                        System.out.println(-1);
                        break;
                    }
                    System.out.println(deque.get(deque.size() - 1));
                    break;
            }
        }
    }
}