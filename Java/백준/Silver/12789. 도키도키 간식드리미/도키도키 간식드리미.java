import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String[] s = br.readLine().split(" ");
		Stack<Integer> stack1 = new Stack<>();
		Stack<Integer> stack2 = new Stack<>();

		int counter = 1;

		for (int i = n - 1; i >= 0; i--) {
			stack1.push(Integer.parseInt(s[i]));
		}

		stack2.push(stack1.pop());

		while (true) {
			if (stack1.isEmpty() && stack2.isEmpty()) {
				System.out.println("Nice");
				return;
			}

			int cur1 = 0;
			if (!stack1.isEmpty()) {
				cur1 = stack1.peek();
			}

			int cur2 = 0;
			if (!stack2.isEmpty()) {
				cur2 = stack2.peek();
			}

			if (counter == cur1) {
				stack1.pop();
				counter++;
				continue;
			}
			if (counter == cur2) {
				stack2.pop();
				counter++;
				continue;
			}
			if (stack1.isEmpty()) {
				System.out.println("Sad");
				return;
			}
			stack2.push(stack1.pop());
		}
	}
}