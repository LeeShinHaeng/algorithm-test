import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String a = st.nextToken();
			String b = st.nextToken();
			sb.append(a).append(" & ").append(b);
			if (isAnagram(a, b)) sb.append(" are anagrams.").append("\n");
			else sb.append(" are NOT anagrams.").append("\n");
		}
		System.out.println(sb);
	}

	private static boolean isAnagram(String a, String b) {
		int[] alphabets = new int[26];
		for (int i = 0; i < a.length(); i++)
			alphabets[a.charAt(i) - 'a']++;

		for (int i = 0; i < b.length(); i++)
			alphabets[b.charAt(i) - 'a']--;

		for (int i = 0; i < alphabets.length; i++)
			if (alphabets[i] != 0) return false;
		
		return true;
	}
}