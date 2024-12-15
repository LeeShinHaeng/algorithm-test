import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int count = 0;

		for (int i = 2023; i <= n; i++) {
			String s = String.valueOf(i);
			if (s.contains("2")) {
				int idx1 = s.indexOf('2');
				s = s.substring(idx1);
				if (s.contains("0")) {
					int idx2 = s.indexOf('0');
					s = s.substring(idx2);
					if (s.contains("2")) {
						int idx3 = s.indexOf('2');
						s = s.substring(idx3);
						if (s.contains("3")) {
							count++;
						}
					}
				}
			}
		}

		System.out.println(count);
	}
}