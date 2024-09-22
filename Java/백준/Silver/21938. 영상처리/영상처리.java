import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int n;
    static int m;
    static int count;
    static boolean[][] filtered;
    static boolean[][] visited;
    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, 1, 0, -1};

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        double[][] arr = new double[n][m];
        filtered = new boolean[n][m];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                int r = Integer.parseInt(st.nextToken());
                int g = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());
                arr[i][j] = (r + g + b) / 3.0;
            }
        }

        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (t <= arr[i][j]) {
                    filtered[i][j] = true;
                }
            }
        }
        countObjects();
        System.out.println(count);
    }

    private static void countObjects() {
        visited = new boolean[n][m];
        count = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (filtered[i][j] && !visited[i][j]) {
                    count++;
                    recursiveCall(i, j);
                }
            }
        }
    }

    private static void recursiveCall(int i, int j) {
        visited[i][j] = true;

        for (int k = 0; k < 4; k++) {
            int nx = i + dx[k];
            int ny = j + dy[k];

            if (nx < 0 || nx >= n || ny < 0 || ny >= m) {
                continue;
            }

            if (filtered[nx][ny] && !visited[nx][ny]) {
                recursiveCall(nx, ny);
            }
        }
    }
}