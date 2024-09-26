import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine());
        
        int twosComplement = ~input + 1;
        int diffBits = input ^ twosComplement;
        int count = Integer.bitCount(diffBits);

        System.out.println(count);
    }
}