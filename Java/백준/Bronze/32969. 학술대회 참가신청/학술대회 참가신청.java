import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {
	static Set<String> set1 = new HashSet<>();
	static Set<String> set2 = new HashSet<>();

	public static void main(String[] args) throws IOException {
		set1.add("social");
		set1.add("history");
		set1.add("language");
		set1.add("literacy");

		set2.add("bigdata");
		set2.add("public");
		set2.add("society");

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input = br.readLine().split(" ");

		for (String s : input) {
			if (set1.contains(s)) {
				System.out.println("digital humanities");
				return;
			} else if (set2.contains(s)) {
				System.out.println("public bigdata");
				return;
			}
		}
	}
}