import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        String s;
        StringTokenizer st;

        String maxName = "";
        int sum = 0;
        int max = 0;

        for (int i = 0; i < tc; i++) {
            s = br.readLine();
            st = new StringTokenizer(br.readLine());
            int k = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            int onePokemon = 0;
            while (m >= k) {
                onePokemon += m / k;
                int tmp = m / k;
                m %= k;
                m += (2 * tmp);
            }
            if (onePokemon > max) {
                max = onePokemon;
                maxName = s;
            }
            sum += onePokemon;
        }

        System.out.println(sum);
        System.out.println(maxName);
    }
}