import java.io.*;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        findMaxThirty();
    }

    private static void findMaxThirty() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input = br.readLine();

        if (! input.contains("0")) {
            System.out.println(-1);
            return;
        }

        char c[] = new char[input.length()];
        int tmp = 0;
        for (int i = 0; i < input.length(); i++) {
            c[i] = input.charAt(i);
            tmp += Integer.parseInt(c[i] + "");
        }

        if (tmp % 3 != 0) {
            System.out.println(-1);
            return;
        }

        Arrays.sort(c);
        for (int i = c.length - 1; i >= 0; i--) {
            bw.append(c[i]);
        }

        bw.flush();
    }
}