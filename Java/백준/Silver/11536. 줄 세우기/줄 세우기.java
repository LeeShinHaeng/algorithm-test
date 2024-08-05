import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        boolean flag;

        String s1 = br.readLine();
        String s2 = br.readLine();
        if (s1.compareTo(s2) < 0) {
            flag = false;
        } else {
            flag = true;
        }

        for (int i = 0; i < n - 2; i++) {
            s1 = s2;
            s2 = br.readLine();

            if ((s1.compareTo(s2) < 0 && flag) ||
                    (s1.compareTo(s2) > 0 && (! flag))) {
                System.out.println("NEITHER");
                return;
            }
        }

        if (flag) {
            System.out.println("DECREASING");
            return;
        }

        System.out.println("INCREASING");
    }
}