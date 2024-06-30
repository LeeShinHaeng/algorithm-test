import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    static int N;
    static boolean[][] graph;
    static boolean[] visited;
    static Queue<Integer> queue = new LinkedList<>();

    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] input = br.readLine().split(" ");
        N = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);
        int v = Integer.parseInt(input[2]);

        graph = new boolean[N + 1][N + 1];
        visited = new boolean[N + 1];

        for (int i = 0; i < m; i++) {
            String[] tmp = br.readLine().split(" ");
            graph[Integer.parseInt(tmp[0])][Integer.parseInt(tmp[1])] = true;
            graph[Integer.parseInt(tmp[1])][Integer.parseInt(tmp[0])] = true;
        }

        dfs(v);
        sb.append("\n");
        visited = new boolean[N + 1];
        bfs(v);

        bw.write(sb.toString());
        bw.flush();
    }

    private static void dfs(int v) {
        visited[v] = true;
        sb.append(v).append(" ");

        for (int i = 0; i <= N; i++) {
            if (graph[v][i] && !visited[i]) {
                dfs(i);
            }
        }

    }

    private static void bfs(int v) {
        queue.add(v);
        visited[v] = true;

        while (!queue.isEmpty()) {
            v = queue.poll();
            sb.append(v).append(" ");

            for (int i = 0; i <= N; i++) {
                if (graph[v][i] && !visited[i]) {
                    queue.add(i);
                    visited[i] = true;
                }
            }
        }
    }
}