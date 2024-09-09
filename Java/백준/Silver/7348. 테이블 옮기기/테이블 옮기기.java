import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        int n;
        String[] s;

        for (int i = 0; i < t; i++) {
            n = Integer.parseInt(br.readLine());
            int[] inUse = new int[200];
            for (int j = 0; j < n; j++) {
                s = br.readLine().split(" ");
                int a = Integer.parseInt(s[0]);
                int b = Integer.parseInt(s[1]);
                if (a > b) {
                    int tmp = a;
                    a = b;
                    b = tmp;
                }
                int from = (a - 1) / 2;
                int to = (b - 1) / 2;
                for (int k = from; k <= to; k++) {
                    inUse[k]++;
                }
            }
            int max = 0;
            for (int use : inUse) {
                if (max < use) {
                    max = use;
                }
            }
            System.out.println(max * 10);
        }
    }
}