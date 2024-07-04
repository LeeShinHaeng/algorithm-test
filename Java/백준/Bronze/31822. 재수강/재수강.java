import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String target = br.readLine();
        target = target.substring(0, 5);
        int size = Integer.parseInt(br.readLine());
        int count = 0;
        for (int i = 0; i < size; i++) {
            String input = br.readLine();
            input = input.substring(0, 5);
            if(input.equals(target)) {
                count++;
            }
        }

        System.out.println(count);
    }
}