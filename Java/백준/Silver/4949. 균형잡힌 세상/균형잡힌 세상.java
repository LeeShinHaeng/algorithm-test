import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String input = br.readLine();
            if (input.equals(".")) {
                break;
            }
            worldBalance(input);
        }
    }

    public static void worldBalance(String input) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '(') {
                stack.push('(');
            } else if (input.charAt(i) == '[') {
                stack.push('[');
            } else if (input.charAt(i) == ')') {
                if (stack.empty() || stack.pop() != '(') {
                    System.out.println("no");
                    return;
                }
            } else if (input.charAt(i) == ']') {
                if (stack.empty() || stack.pop() != '[') {
                    System.out.println("no");
                    return;
                }
            }
        }
        if(stack.isEmpty()){
            System.out.println("yes");
            return;
        }
        System.out.println("no");
    }
}