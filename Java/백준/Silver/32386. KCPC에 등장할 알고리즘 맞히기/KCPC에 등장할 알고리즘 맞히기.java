import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
	public static void main(String[] args) throws IOException {
		Map<String, Integer> map = new HashMap<>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		for (int i = 0; i < N; i++) {
			String[] input = br.readLine().split(" ");
			int t = Integer.parseInt(input[1]);
			for (int j = 2; j < t + 2; j++) {
				map.put(input[j], map.getOrDefault(input[j], 0) + 1);
			}
		}

		List<String> keySet = new ArrayList<>(map.keySet());
		keySet.sort((o1, o2) -> map.get(o2) - map.get(o1));

		if(map.size() == 1){
			System.out.println(keySet.get(0));
			return;
		}

		if(map.get(keySet.get(0)).equals(map.get(keySet.get(1)))) {
			System.out.println(-1);
			return;
		}

		System.out.println(keySet.get(0));
	}
}