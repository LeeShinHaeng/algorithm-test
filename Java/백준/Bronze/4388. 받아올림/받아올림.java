import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String[] line = br.readLine().split(" ");
            if (line[0].equals("0") && line[1].equals("0")) break;
            String bigger, smaller;
            if (line[0].length() >= line[1].length()) {
                bigger = line[0];
                smaller = line[1];
            } else {
                bigger = line[1];
                smaller = line[0];
            }

            int diff = bigger.length() - smaller.length();
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < diff; i++) {
                sb.append(0);
            }
            sb.append(smaller);
            String s = sb.toString();
            int count = 0;
            int carry = 0;
            for (int i = bigger.length() - 1; i >= 0; i--) {
                int a = bigger.charAt(i) - '0';
                int b = s.charAt(i) - '0';
                int tmp = a + b + carry;

                if (tmp >= 10) {
                    count++;
                    carry = tmp / 10;
                }
            }

            System.out.println(count);
        }
    }
}