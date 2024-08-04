import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int flag;

        String s1 = br.readLine();
        String s2 = br.readLine();
        if (s1.compareTo(s2) < 0) {
            flag = -1;
        } else {
            flag = 1;
        }

        for (int i = 0; i < n - 2; i++) {
            s1 = s2;
            s2 = br.readLine();

            if ((s1.compareTo(s2) < 0 && flag == 1) ||
                    (s1.compareTo(s2) > 0 && flag == -1)) {
                System.out.println("NEITHER");
                return;
            }
        }

        if (flag == 1) {
            System.out.println("DECREASING");
            return;
        }

        System.out.println("INCREASING");
    }
}