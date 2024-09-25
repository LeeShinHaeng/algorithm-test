import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int k = rev(n) + rev(m);
        System.out.println(rev(k));
    }

    private static int rev(int input) {
        if (input == 0) return 0;
        int output = 0;
        while (true){
            if(input % 10 == 0){
                input /= 10;
            } else {
                break;
            }
        }

        while (input > 0) {
            output *= 10;
            output += input % 10;
            input /= 10;
        }
        return output;
    }
}