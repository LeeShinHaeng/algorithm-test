import java.io.*;
import java.util.*;

class Main {
	static boolean[] visited;
	static Map<Integer, HashSet<Integer>> map;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] s = br.readLine().split(" ");
		int n = Integer.parseInt(s[0]);
		int m = Integer.parseInt(s[1]);
		map = new HashMap<>();
		for (int i = 1; i <= n; i++) {
			map.put(i, new HashSet<>());
		}
		for (int i = 0; i < m; i++) {
			s = br.readLine().split(" ");
			int a = Integer.parseInt(s[0]);
			int b = Integer.parseInt(s[1]);
			map.get(a).add(b);
			map.get(b).add(a);
		}

		visited = new boolean[n + 1];
		int count = 0;
		for (int i = 1; i <= n; i++) {
			if (!visited[i]) {
				dfs(i);
				count++;
			}
		}
		System.out.println(count);
	}

	private static void dfs(int current) {
		visited[current] = true;
		for (int next : map.get(current)) {
			if (!visited[next]) {
				dfs(next);
			}
		}
	}
}