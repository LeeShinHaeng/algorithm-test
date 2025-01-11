import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		int numOfProblem = 0;

		while (true) {
			s = br.readLine();
			if (s.charAt(s.length() - 1) == '끝') 
				break;

			if (s.charAt(0) == '문') {
				numOfProblem++;
				continue;
			}

			if (numOfProblem <= 0)
				numOfProblem += 2;

			else
				numOfProblem -= 1;
		}

		if (numOfProblem > 0)
			System.out.print("힝구");
		else
			System.out.print("고무오리야 사랑해");
	}
}