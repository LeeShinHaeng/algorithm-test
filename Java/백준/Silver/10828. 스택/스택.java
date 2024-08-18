import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < tc; i++) {
            String[] s = br.readLine().split(" ");
            switch (s[0]) {
                case "push":
                    stack.push(Integer.parseInt(s[1]));
                    break;
                case "pop":
                    if (stack.isEmpty()) {
                        sb.append(-1).append("\n");
                        break;
                    }
                    sb.append(stack.pop()).append("\n");
                    break;
                case "size":
                    sb.append(stack.size()).append("\n");
                    break;
                case "empty":
                    if (stack.isEmpty()) {
                        sb.append(1).append("\n");
                        break;
                    }
                    sb.append(0).append("\n");
                    break;
                case "top":
                    if (stack.isEmpty()) {
                        sb.append(-1).append("\n");
                        break;
                    }
                    sb.append(stack.peek()).append("\n");
                    break;
            }
        }
        System.out.println(sb);
    }
}