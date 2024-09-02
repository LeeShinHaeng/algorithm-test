import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        String[] s;
        StringBuilder sb = new StringBuilder();
        while (tc-- > 0) {
            s = br.readLine().split(" ");
            int j = Integer.parseInt(s[0]);
            int n = Integer.parseInt(s[1]);
            int[] boxs = new int[n];

            for (int i = 0; i < n; i++) {
                s = br.readLine().split(" ");
                int x = Integer.parseInt(s[0]);
                int y = Integer.parseInt(s[1]);
                boxs[i] = x * y;
            }

            Arrays.sort(boxs);
            int count = 0;
            for (int i = n - 1; i >= 0; i--) {
                if (j <= 0) {
                    sb.append(count).append("\n");
                    break;
                }
                j -= boxs[i];
                count++;
            }
        }
        System.out.println(sb);
    }
}