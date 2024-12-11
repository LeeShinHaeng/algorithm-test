import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		int sum = 0;
		for (int i = 0; i < n; i++) {
			String tmp = br.readLine();
			switch (tmp) {
				case "1/4":
					num1++;
					break;
				case "1/2":
					num2++;
					break;
				case "3/4":
					num3++;
			}
		}
		sum = num3;
		sum += (int) Math.ceil(num2 / 2.0);

		if (num3 >= num1) {
			System.out.println(sum);
			return;
		}

		int need = num1 - num3;
		int left = 0;
		if (sum % 2 == 1) {
			left = 2;
		}
		need -= left;
		if (need <= 0) {
			System.out.println(sum);
			return;
		}

		int finalPizza = (int) Math.ceil(need / 4.0);
		sum += finalPizza;
		System.out.println(sum);
	}
}