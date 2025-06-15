import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		int len = s.length();

		Queue<String> q = new PriorityQueue<>();
		for (int i = 0; i < len; i++)
			q.offer(s.substring(i, len));

		StringBuilder sb = new StringBuilder();
		while (!q.isEmpty())
			sb.append(q.poll()).append("\n");
		System.out.println(sb);
	}
}