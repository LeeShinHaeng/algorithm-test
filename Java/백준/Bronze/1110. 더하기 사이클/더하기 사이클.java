import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine());
        int cur = input;
        int count = 0;
        while (true) {
            if (cur == input && count > 0) {
                System.out.println(count);
                return;
            }

            int a = cur / 10;
            int b = cur % 10;

            int newNum = a + b;
            int newB = newNum % 10;

            cur = b * 10;
            cur += newB;
            count++;

            if (count == Integer.MAX_VALUE) {
                return;
            }
        }
    }
}