import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        
        if(input.length() < 2){
            System.out.println("CE");
            return;
        }
        
        if ((input.charAt(0) == '\"') && (input.charAt(input.length() - 1) == '\"')) {
            if (input.length() == 2) {
                System.out.println("CE");
                return;
            }
            System.out.println(input.substring(1, input.length() - 1));
            return;
        }
        System.out.println("CE");
    }
}
