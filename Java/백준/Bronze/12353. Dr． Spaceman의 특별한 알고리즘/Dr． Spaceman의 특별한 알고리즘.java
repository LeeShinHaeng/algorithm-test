import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        for (int i = 0; i < tc; i++) {
            String[] s = br.readLine().split(" ");
            char c = s[0].charAt(0);

            int feetA = s[1].charAt(0) - '0';
            s[1] = s[1].substring(2, s[1].length() - 1);
            int inchA = Integer.parseInt(s[1]);

            int feetB = s[2].charAt(0) - '0';
            s[2] = s[2].substring(2, s[2].length() - 1);
            int inchB = Integer.parseInt(s[2]);

            double result = feetA * 12 + feetB * 12 + inchA + inchB;

            if (c == 'B') {
                result += 5;
            } else {
                result -= 5;
            }

            result /= 2;
            int resultA = (int) Math.ceil(result - 4);
            int resultB = (int) Math.floor(result + 4);

            sb.append("Case #").append(i + 1).append(": ")
                    .append(resultA / 12).append("'").append(resultA % 12).append("\" to ")
                    .append(resultB / 12).append("'").append(resultB % 12).append("\"").append("\n");
        }
        System.out.println(sb);
    }
}