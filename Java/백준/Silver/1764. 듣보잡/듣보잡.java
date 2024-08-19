import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int n = Integer.parseInt(s[0]);
        int m = Integer.parseInt(s[1]);

        HashSet<String> names = new HashSet<>();

        for (int i = 0; i < n; i++) {
            String name = br.readLine();
            names.add(name);
        }

        StringBuilder sb = new StringBuilder();
        ArrayList<String> strangers = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            String name = br.readLine();
            if (names.contains(name)) {
                strangers.add(name);
            }
        }
        
        Collections.sort(strangers);
        sb.append(strangers.size()).append("\n");
        for (String stranger : strangers) {
            sb.append(stranger).append("\n");
        }
        System.out.println(sb);
    }
}