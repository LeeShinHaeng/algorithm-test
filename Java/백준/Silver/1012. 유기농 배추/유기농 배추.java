import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {
    static int[] dx = {0, 0, -1, 1};
    static int[] dy = {-1, 1, 0, 0};
    static boolean[][] visited;
    static boolean[][] field;
    static int n;
    static int m;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            int count = 0;

            String[] s = br.readLine().split(" ");
            n = Integer.parseInt(s[0]);
            m = Integer.parseInt(s[1]);
            int k = Integer.parseInt(s[2]);
            field = new boolean[n][m];
            visited = new boolean[n][m];

            for (int j = 0; j < k; j++) {
                s = br.readLine().split(" ");
                int x = Integer.parseInt(s[0]);
                int y = Integer.parseInt(s[1]);
                field[x][y] = true;
            }

            for (int x = 0; x < n; x++) {
                for (int y = 0; y < m; y++) {
                    if (field[x][y] && !visited[x][y]) {
                        dfs(x, y);
                        count++;
                    }
                }
            }
            System.out.println(count);
        }
    }

    static void dfs(int x, int y) {
        visited[x][y] = true;

        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx >= 0 && nx < n && ny >= 0 && ny < m && field[nx][ny] && !visited[nx][ny]) {
                dfs(nx, ny);
            }
        }
    }
}