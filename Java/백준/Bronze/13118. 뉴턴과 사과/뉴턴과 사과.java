import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        String[] men = br.readLine().split(" ");
        String[] apple = br.readLine().split(" ");

        for (int i = 0; i < men.length; i++) {
            if (men[i].equals(apple[0])) {
                System.out.println(i + 1);
                return;
            }
        }
        System.out.println(0);
    }
}