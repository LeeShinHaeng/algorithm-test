import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        while (true) {
            String line = br.readLine();
            if (line.equals("0"))
                break;

            if (line.length() == 1) {
                sb.append("yes").append("\n");
                continue;
            }

            int mid = line.length() / 2;

            String top = line.substring(0, mid);

            StringBuilder sb1;
            if (line.length() % 2 == 0)
                sb1 = new StringBuilder(line.substring(mid));
            else
                sb1 = new StringBuilder(line.substring(mid + 1));
            String bottom = sb1.reverse().toString();

            if (top.equals(bottom)) {
                sb.append("yes").append("\n");
                continue;
            }
            sb.append("no").append("\n");
        }
        System.out.println(sb);
    }
}