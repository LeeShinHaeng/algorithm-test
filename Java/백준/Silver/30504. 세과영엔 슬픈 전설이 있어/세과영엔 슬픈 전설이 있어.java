import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        int[] a = new int[tc];
        ArrayList<Integer> b = new ArrayList<>();

        String[] as = br.readLine().split(" ");
        String[] bs = br.readLine().split(" ");

        for (int i = 0; i < tc; i++) {
            a[i] = Integer.parseInt(as[i]);
            b.add(Integer.parseInt(bs[i]));
        }
        Collections.sort(b);

        int count = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < tc; i++) {
            int today = a[i];

            for (int j = 0; j < b.size(); j++) {
                if (today <= b.get(j)) {
                    sb.append(b.get(j)).append(" ");
                    b.remove(j);
                    count++;
                    break;
                }
            }
            if (count <= i) {
                System.out.println(-1);
                return;
            }
        }
        System.out.println(sb);
    }
}