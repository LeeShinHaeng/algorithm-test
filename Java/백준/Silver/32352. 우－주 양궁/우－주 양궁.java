import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	static int[] arrow = new int[6];
	static int[] target = new int[6];

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] input = br.readLine().split(" ");
		for (int i = 0; i < 6; i++) {
			arrow[i] = Integer.parseInt(input[i]);
		}

		input = br.readLine().split(" ");
		for (int i = 0; i < 6; i++) {
			target[i] = Integer.parseInt(input[i]);
		}

		int collisionFrame = findCollisionFrame();
		System.out.println(collisionFrame);
	}

	private static int findCollisionFrame() {
		boolean isXOverlap = arrow[0] < target[1] && arrow[1] > target[0];
		boolean isYOverlap = arrow[2] < target[3] && arrow[3] > target[2];
		if (!isXOverlap || !isYOverlap) {
			return -1;
		}

		for (int frame = 0; ; frame++) {
			int arrowZMin = arrow[4] - frame;
			int arrowZMax = arrow[5] - frame;

			if (arrowZMax <= target[4]) {
				break;
			}

			if (arrowZMin < target[5]) {
				return frame;
			}
		}

		return -1;
	}
}