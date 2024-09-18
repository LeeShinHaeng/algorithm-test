import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int n = Integer.parseInt(s[0]);
        int m = Integer.parseInt(s[1]);

        int[] list = new int[n];
        List<Integer> friends = new ArrayList<>();
        s = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            list[i] = Integer.parseInt(s[i]);
        }
        s = br.readLine().split(" ");
        for (int i = 0; i < m; i++) {
            friends.add(Integer.parseInt(s[i]));
        }

        int count = m;
        for (int i = 0; i < m; i++) {
            if (friends.contains(list[i])) {
                count--;
            }
        }

        System.out.println(count);
    }
}
