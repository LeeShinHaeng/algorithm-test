import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < tc; i++) {
            String[] s = br.readLine().split(" ");
            int n = Integer.parseInt(s[0]);
            for (char ch : s[1].toCharArray()) {
                for (int j = 0; j < n; j++) {
                    sb.append(ch);
                }
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
