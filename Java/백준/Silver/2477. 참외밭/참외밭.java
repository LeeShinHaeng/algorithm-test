import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// 가장 긴 가로와 세로의 위치를 각각 구한다.
		// 가장 긴 가로 양옆에 위치한 두 세로의 길이 차이가 빈 사각형의 세로가 된다.
		// 세로도 마찬가지

		int N = Integer.parseInt(br.readLine());
		int[] dis = new int[6];
		int maxWidth = 0, maxHeight = 0, maxHeightIndex = 0, maxWidthIndex = 0;
		for (int i = 0; i < 6; i++) {
			String[] input = br.readLine().split(" ");
			int dir = Integer.parseInt(input[0]);
			dis[i] = Integer.parseInt(input[1]);
			if ((dir == 1 || dir == 2) && dis[i] > maxWidth) {
				maxWidth = dis[i];
				maxHeightIndex = i;
			}
			if ((dir == 3 || dir == 4) && dis[i] > maxHeight) {
				maxHeight = dis[i];
				maxWidthIndex = i;
			}
		}

		int rightIndex, leftIndex, minWidth, minHeight;

		if (maxWidthIndex == 5) rightIndex = 0;
		else rightIndex = maxWidthIndex + 1;

		if (maxWidthIndex == 0) leftIndex = 5;
		else leftIndex = maxWidthIndex - 1;
		minHeight = Math.abs(dis[rightIndex] - dis[leftIndex]);

		if (maxHeightIndex == 5) rightIndex = 0;
		else rightIndex = maxHeightIndex + 1;

		if (maxHeightIndex == 0) leftIndex = 5;
		else leftIndex = maxHeightIndex - 1;
		minWidth = Math.abs(dis[rightIndex] - dis[leftIndex]);

		System.out.println(((maxWidth * maxHeight) - (minHeight * minWidth)) * N);
	}
}