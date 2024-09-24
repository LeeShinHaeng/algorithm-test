import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int tc = Integer.parseInt(br.readLine());
        for (int i = 0; i < tc; i++) {
            int n = Integer.parseInt(br.readLine());
            int[] arrL = new int[n];
            int[] arrR = new int[n];
            int count = 0;

            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j = 0; j < n; j++) {
                arrL[j] = Integer.parseInt(st.nextToken());
            }
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < n; j++) {
                arrR[j] = Integer.parseInt(st.nextToken());
            }

            for(int j = 0; j < n; j++) {
                int tmp = arrL[j];
                int k = Arrays.binarySearch(arrR, tmp + 1000);
                if(k >= 0){
                    count++;
                }
            }
            sb.append(count / 2).append("\n");
        }
        System.out.println(sb);
    }
}