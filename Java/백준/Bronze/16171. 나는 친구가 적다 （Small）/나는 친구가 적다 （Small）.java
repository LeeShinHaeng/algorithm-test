import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String base = br.readLine();
        String target = br.readLine();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < base.length(); i++) {
            char c = base.charAt(i);
            if (c >= '0' && c <= '9') {
                continue;
            }
            sb.append(c);
        }

        if (sb.toString().contains(target)) {
            System.out.println(1);
            return;
        }
        System.out.println(0);
    }
}