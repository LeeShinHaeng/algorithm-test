import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int tc = Integer.parseInt(br.readLine());
        br.readLine();

        for (int i = 0; i < tc; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            int maxN = 0;
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                maxN = Math.max(maxN, Integer.parseInt(st.nextToken()));
            }

            int maxM = 0;
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                maxM = Math.max(maxM, Integer.parseInt(st.nextToken()));
            }

            if (maxN >= maxM) {
                sb.append("S").append("\n");
            } else {
                sb.append("B").append("\n");
            }
            if (i == tc - 1) {
                continue;
            }
            br.readLine();
        }
        System.out.println(sb);
    }
}