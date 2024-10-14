import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

class Main {
    static int[][] arr;
    static int[][] result;
    static boolean[][] visited;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int n = Integer.parseInt(s[0]);
        int m = Integer.parseInt(s[1]);
        arr = new int[n][m];
        result = new int[n][m];
        visited = new boolean[n][m];

        for (int i = 0; i < n; i++) {
            Arrays.fill(result[i], -1);
        }

        int startX = 0;
        int startY = 0;

        for (int i = 0; i < n; i++) {
            s = br.readLine().split(" ");
            for (int j = 0; j < m; j++) {
                arr[i][j] = Integer.parseInt(s[j]);
                if (arr[i][j] == 2) {
                    startX = i;
                    startY = j;
                } else if (arr[i][j] == 0) {
                    result[i][j] = 0;
                }
            }
        }

        bfs(startX, startY);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                sb.append(result[i][j]).append(" ");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }

    private static void bfs(int startX, int startY) {
        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};

        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{startX, startY});
        visited[startX][startY] = true;
        result[startX][startY] = 0;

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int x = current[0];
            int y = current[1];

            for (int i = 0; i < 4; i++) {
                int newX = x + dx[i];
                int newY = y + dy[i];

                if (newX < 0 || newX >= arr.length || newY < 0 || newY >= arr[0].length || visited[newX][newY])
                    continue;

                visited[newX][newY] = true;

                if (arr[newX][newY] == 0) {
                    result[newX][newY] = 0;
                    continue;
                }

                result[newX][newY] = result[x][y] + 1;
                queue.add(new int[]{newX, newY});
            }
        }
    }
}