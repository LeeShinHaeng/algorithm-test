import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
    static boolean[][] family;
    static boolean[] visited;
    static int count;
    static int result = -1;  // 답을 저장할 변수

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        family = new boolean[n][n];
        visited = new boolean[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken()) - 1;
        int y = Integer.parseInt(st.nextToken()) - 1;
        int m = Integer.parseInt(br.readLine());

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken()) - 1;
            int b = Integer.parseInt(st.nextToken()) - 1;
            family[a][b] = family[b][a] = true;
        }

        count = 0;
        dfs(x, y, 0);
        System.out.println(result);
    }

    private static void dfs(int start, int target, int depth) {
        visited[start] = true;

        if (start == target) {
            result = depth;
            return;
        }

        for (int i = 0; i < family.length; i++) {
            if (family[start][i] && !visited[i]) {
                dfs(i, target, depth + 1);
            }
        }
    }
}