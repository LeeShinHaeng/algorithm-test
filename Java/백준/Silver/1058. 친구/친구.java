import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

class Main {
    static boolean[][] graph;
    static int n;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        graph = new boolean[n][n];

        String s;
        char c;
        for (int i = 0; i < n; i++) {
            s = br.readLine();
            for (int j = 0; j < n; j++) {
                c = s.charAt(j);
                if (c == 'Y') {
                    graph[i][j] = true;
                }
            }
        }

        int max = 0;
        for (int i = 0; i < n; i++) {
            Set<Integer> set = new HashSet<>();
            for (int j = 0; j < n; j++) {
                if (graph[i][j]) {
                    set.add(j);
                    for (int k = 0; k < n; k++) {
                        if (graph[j][k] && i != k) {
                            set.add(k);
                        }
                    }
                }
            }
            max = Math.max(max, set.size());
        }

        System.out.println(max);
    }
}
