import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    static String[] s;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        for (int i = 0; i < tc; i++) {
            int n = Integer.parseInt(br.readLine());
            s = new String[n];
            for (int j = 0; j < n; j++) {
                s[j] = br.readLine();
            }
            findPal();
        }
        System.out.println(sb);
    }

    private static void findPal() {
        for (int i = 0; i < s.length; i++) {
            for (int j = 0; j < s.length; j++) {
                if (i == j) {
                    continue;
                }
                String tmp = s[i] + s[j];
                if (isPal(tmp)) {
                    sb.append(tmp).append("\n");
                    return;
                }
            }
        }
        sb.append("0").append("\n");
    }

    private static boolean isPal(String input) {
        for (int i = 0; i < input.length() / 2; i++) {
            if (input.charAt(i) != input.charAt(input.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}