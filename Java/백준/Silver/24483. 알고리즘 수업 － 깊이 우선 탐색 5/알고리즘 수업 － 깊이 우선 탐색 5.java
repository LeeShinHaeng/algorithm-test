import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class Main {
    static List<Integer>[] graph;
    static boolean[] visited;
    static int[] depth;
    static int[] time;
    static int n;
    static int watch = 1;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());

        graph = new ArrayList[n];
        visited = new boolean[n];
        depth = new int[n];
        time = new int[n];

        Arrays.fill(depth, -1);

        for (int i = 0; i < n; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken()) - 1; 
            int b = Integer.parseInt(st.nextToken()) - 1;
            graph[a].add(b);
            graph[b].add(a); 
        }

        for (int i = 0; i < n; i++) {
            Collections.sort(graph[i]);
        }

        dfs(r - 1, 0);

        long result = 0;

        for (int i = 0; i < n; i++) {
            result += (long) depth[i] * time[i];
        }

        System.out.println(result);
    }

    private static void dfs(int now, int d) {
        if (visited[now])
            return;

        visited[now] = true;
        depth[now] = d;
        time[now] = watch++;

        for (int next : graph[now]) {
            if (!visited[next]) {
                dfs(next, d + 1);
            }
        }
    }
}