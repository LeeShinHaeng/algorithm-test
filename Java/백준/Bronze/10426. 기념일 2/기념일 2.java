import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input = br.readLine().split(" ");
		String[] first = input[0].split("-");
		int year = Integer.parseInt(first[0]);
		int month = Integer.parseInt(first[1]);
		int day = Integer.parseInt(first[2]);
		int N = Integer.parseInt(input[1]);

		LocalDate localDate = LocalDate.of(year, month, day);
		localDate = localDate.plusDays(N - 1);
		System.out.println(localDate.format(DateTimeFormatter.ofPattern("yyyy-MM-dd")));
	}
}