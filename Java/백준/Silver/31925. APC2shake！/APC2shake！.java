import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		Map<Integer, String> map = new HashMap<>();
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String name = st.nextToken();
			if (st.nextToken().equals("hewhak")) continue;
			if (st.nextToken().equals("winner")) continue;
			int score = Integer.parseInt(st.nextToken());
			if (score <= 3 && score > 0) continue;
			int apc = Integer.parseInt(st.nextToken());
			map.put(apc, name);
			pq.add(apc);
		}

		ArrayList<String> list = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			if (pq.isEmpty()) break;
			int apc = pq.poll();
			list.add(map.get(apc));
		}
		list.sort(String::compareTo);

		StringBuilder sb = new StringBuilder();
		sb.append(list.size()).append("\n");
		for (String s : list) {
			sb.append(s).append("\n");
		}
		System.out.println(sb);
	}
}