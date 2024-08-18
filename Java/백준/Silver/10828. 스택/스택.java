import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < tc; i++) {
            String[] s = br.readLine().split(" ");
            switch (s[0]) {
                case "push":
                    stack.push(Integer.parseInt(s[1]));
                    break;
                case "pop":
                    if (stack.isEmpty()) {
                        System.out.println(-1);
                        break;
                    }
                    System.out.println(stack.pop());
                    break;
                case "size":
                    System.out.println(stack.size());
                    break;
                case "empty":
                    if (stack.isEmpty()) {
                        System.out.println(1);
                        break;
                    }
                    System.out.println(0);
                    break;
                case "top":
                    if (stack.isEmpty()) {
                        System.out.println(-1);
                        break;
                    }
                    System.out.println(stack.peek());
                    break;
            }
        }
    }
}