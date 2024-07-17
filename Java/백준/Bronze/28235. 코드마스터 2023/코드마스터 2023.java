import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        char c = s.charAt(0);

        switch (c) {
            case 'S':
                System.out.println("HIGHSCHOOL");
                break;
            case 'C':
                System.out.println("MASTER");
                break;
            case '2':
                System.out.println("0611");
                break;
            case 'A':
                System.out.println("CONTEST");
                break;
        }
    }
}