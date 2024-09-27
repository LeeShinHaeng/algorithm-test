import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String formula = br.readLine();

        Stack<Integer> stack = new Stack<>();
        int result = 0;
        int tmp = 0;

        for (int i = 0; i < formula.length(); i++) {
            char c = formula.charAt(i);

            switch (c) {
                case 'H':
                    tmp = 1;
                    if (i + 1 < formula.length() && Character.isDigit(formula.charAt(i + 1))) {
                        tmp *= (formula.charAt(i + 1) - '0');
                        i++;
                    }
                    result += tmp;
                    break;

                case 'C':
                    tmp = 12;
                    if (i + 1 < formula.length() && Character.isDigit(formula.charAt(i + 1))) {
                        tmp *= (formula.charAt(i + 1) - '0');
                        i++;
                    }
                    result += tmp;
                    break;

                case 'O':
                    tmp = 16;
                    if (i + 1 < formula.length() && Character.isDigit(formula.charAt(i + 1))) {
                        tmp *= (formula.charAt(i + 1) - '0');
                        i++;
                    }
                    result += tmp;
                    break;

                case '(':
                    stack.push(result);
                    result = 0;
                    break;

                case ')':
                    if (i + 1 < formula.length() && Character.isDigit(formula.charAt(i + 1))) {
                        result *= (formula.charAt(i + 1) - '0');
                        i++;
                    }
                    result += stack.pop();
                    break;
            }
        }

        System.out.println(result);
    }
}