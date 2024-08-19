import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        while (true) {
            String[] s = br.readLine().split(" ");
            if (s[0].equals("#")) break;

            String name = s[0];
            int age = Integer.parseInt(s[1]);
            int weight = Integer.parseInt(s[2]);

            if (age > 17 || weight >= 80) {
                sb.append(name).append(" Senior\n");
                continue;
            }
            sb.append(name).append(" Junior\n");
        }
        System.out.println(sb);
    }
}