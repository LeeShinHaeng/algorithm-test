import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            String input = br.readLine();
            if (input.length() != 16) {
                bw.write('F' + "\n");
                continue;
            }
            int sum = 0;
            for (int j = 0; j < 16; j++) {
                int tmp = Character.getNumericValue(input.charAt(j));
                if (j % 2 != 0) {
                    sum += tmp;
                    continue;
                }
                tmp *= 2;
                if (tmp > 9) {
                    sum += tmp / 10;
                }
                sum += tmp % 10;
            }
            if (sum % 10 == 0) {
                bw.write('T' + "\n");
                continue;
            }
            bw.write('F' + "\n");
        }
        bw.flush();
    }
}