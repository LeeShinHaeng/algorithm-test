import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        missingParenthesis(input);
    }

    public static void missingParenthesis(String input) {
        StringTokenizer st = new StringTokenizer(input, "-");
        long sum = 0;
        boolean isFirst = true;

        while (st.hasMoreTokens()) {
            StringTokenizer adds = new StringTokenizer(st.nextToken(), "+");
            long tmp = 0;
            while (adds.hasMoreTokens()) {
                tmp += Integer.parseInt(adds.nextToken());
            }

            if (isFirst) {
                sum += tmp;
                isFirst = false;
            } else {
                sum -= tmp;
            }
        }

        System.out.println(sum);
    }
}