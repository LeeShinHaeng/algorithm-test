import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();

		try {
			int N = Integer.parseInt(s);
			if(N <= 32_767 && N >= -32_768) {
				System.out.println("short");
				return;
			}
			System.out.println("int");
		} catch (Exception e){
			System.out.println("long long");
		}
	}
}