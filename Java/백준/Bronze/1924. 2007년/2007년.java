import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        String[] weeks = {
                "SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"
        };

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int month = Integer.parseInt(s[0]);
        int day = Integer.parseInt(s[1]);

        for (int i = month - 1; i > 0; i--) {
            switch (i) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    day += 31;
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    day += 30;
                    break;
                case 2:
                    day += 28;
                    break;
            }
        }

        day %= 7;
        System.out.println(weeks[day]);
    }
}