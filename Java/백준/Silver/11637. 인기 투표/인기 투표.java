import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int tc = Integer.parseInt(br.readLine());
        for (int i = 0; i < tc; i++) {
            int n = Integer.parseInt(br.readLine());
            int[] votes = new int[n];
            int total = 0;
            int max = 0;
            int isEqual = 0;
            int maxIndex = 0;

            for (int j = 0; j < n; j++) {
                votes[j] = Integer.parseInt(br.readLine());
                total += votes[j];
                if(max <= votes[j]) {
                    isEqual = max;
                    max = votes[j];
                    maxIndex = j + 1;
                }
            }

            if(isEqual == max) {
                sb.append("no winner").append("\n");
                continue;
            }

            if(max > total/2){
                sb.append("majority winner ").append(maxIndex).append("\n");
                continue;
            }

            sb.append("minority winner ").append(maxIndex).append("\n");
        }
        System.out.println(sb);
    }
}