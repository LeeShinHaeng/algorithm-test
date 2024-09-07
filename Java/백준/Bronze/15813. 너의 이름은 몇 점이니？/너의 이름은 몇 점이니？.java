import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        String s = br.readLine();

        int sum = 0;
        for(int i = 0; i < tc; i++) {
            char c = s.charAt(i);
            sum += c - 'A' + 1;
        }
        System.out.println(sum);
    }
}
