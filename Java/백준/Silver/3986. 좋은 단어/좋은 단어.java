import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        int count = 0;

        for (int i = 0; i < tc; i++) {
            Stack<Character> stack = new Stack<>();
            String s = br.readLine();
            for (int j = 0; j < s.length(); j++) {
                char c = s.charAt(j);
                if ((!stack.empty()) && (c == stack.peek())) {
                    stack.pop();
                    continue;
                }
                stack.push(c);
            }

            if (stack.isEmpty()) {
                count++;
            }
        }

        System.out.println(count);
    }
}