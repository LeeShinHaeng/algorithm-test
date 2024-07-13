import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        int now = 12;
        boolean direction = true;
        int size = Integer.parseInt(br.readLine());

        for (int i = 0; i < size; i++) {
            String[] s = br.readLine().split(" ");
            int card = Integer.parseInt(s[1]);
            boolean isHourglass = s[0].equals("HOURGLASS");
            now = direction ? now + 1 : now - 1;

            if (now >= 13)
                now = 1;

            if (now <= 0)
                now = 12;

            sb.append(now).append(" ");

            if (card == now) {
                if (isHourglass)
                    sb.append("NO\n");
                else
                    sb.append("YES\n");

            } else {
                if (isHourglass)
                    direction = !direction;
                sb.append("NO\n");
            }
        }
        System.out.println(sb);
    }
}