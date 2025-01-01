import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input = br.readLine().split(" ");
		int[] nums = new int[20];
		int index = 0;
		for (int i = 0; i < input.length; i++) {
			nums[i] = Integer.parseInt(input[i]);
			if (nums[i] == 20) index = i;
		}

		int sum = 20;
		if (index == 0) {
			sum += nums[1] + nums[19];
		} else if (index == 19) {
			sum += nums[0] + nums[18];
		} else {
			sum += nums[index - 1] + nums[index + 1];
		}

		double average = sum / 3.0;

		if (average > 10.5) {
			System.out.println("Alice");
		} else if (average == 10.5) {
			System.out.println("Tie");
		} else {
			System.out.println("Bob");
		}
	}
}