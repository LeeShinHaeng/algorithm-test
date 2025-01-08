import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String[] s = br.readLine().split(" ");
		int[] count = new int[64];

		for (int i = 0; i < N; i++) {
			long num = Long.parseLong(s[i]);
			if (num == 0) continue;
			int key = Long.numberOfTrailingZeros(Long.highestOneBit(num));
			count[key]++;
		}

		int max = 0;
		for (int i = 0; i < 63; i++) {
			int carry = count[i] / 2;
			count[i + 1] += carry;
			count[i] %= 2;

			if (count[i] > 0)
				max = i;
		}
		
		System.out.println((long) Math.pow(2, max));
	}
}