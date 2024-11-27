import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		List<Integer> a = new ArrayList<>();
		List<Integer> b = new ArrayList<>();
		String[] as = br.readLine().split(" ");
		String[] bs = br.readLine().split(" ");
		for (int i = 0; i < n; i++) {
			a.add(Integer.parseInt(as[i]));
			b.add(Integer.parseInt(bs[i]));
		}

		Collections.sort(a);
		b.sort(Collections.reverseOrder());

		int sum = 0;
		for (int i = 0; i < n; i++) {
			sum += a.get(i) * b.get(i);
		}
		System.out.println(sum);
	}
}