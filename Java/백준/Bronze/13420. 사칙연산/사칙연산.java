import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int size = Integer.parseInt(br.readLine());
        for (int i = 0; i < size; i++) {
            String[] input = br.readLine().split(" ");
            long a = Long.parseLong(input[0]);
            long b = Long.parseLong(input[2]);
            long c = Long.parseLong(input[4]);
            char operator = input[1].charAt(0);
            long result = 0;

            switch (operator) {
                case '+':
                    result = a + b;
                    break;
                case '-':
                    result = a - b;
                    break;
                case '*':
                    result = a * b;
                    break;
                case '/':
                    result = a / b;
                    break;
            }

            if (result == c) {
                sb.append("correct\n");
            } else {
                sb.append("wrong answer\n");
            }
        }
        System.out.println(sb);
    }
}