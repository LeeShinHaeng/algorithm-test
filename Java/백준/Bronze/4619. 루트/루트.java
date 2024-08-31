import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] s;
        StringBuilder sb = new StringBuilder();
        while (true) {
            s = br.readLine().split(" ");
            int b = Integer.parseInt(s[0]);
            int n = Integer.parseInt(s[1]);

            if (b == 0 && n == 0) break;

            int a = 1;
            int closestA = 1;
            int closestDiff = Math.abs(b - (int) Math.pow(1, n));

            for (int i = 2; i < Integer.MAX_VALUE; i++) {
                int result = (int) Math.pow(i, n);
                int diff = Math.abs(b - result);

                if (diff < closestDiff) {
                    closestDiff = diff;
                    closestA = i;
                } else if (diff > closestDiff) {
                    break;
                }
            }

            sb.append(closestA).append("\n");
        }

        System.out.println(sb);
    }
}
