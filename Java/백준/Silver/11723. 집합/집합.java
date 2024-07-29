import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Set<Integer> set = new HashSet<>();
        StringBuilder sb = new StringBuilder();

        int k = Integer.parseInt(br.readLine());
        for (int i = 0; i < k; i++) {
            String[] s = br.readLine().split(" ");
            char c = s[0].charAt(1);
            switch (c) {
                case 'd':
                    set.add(Integer.parseInt(s[1]));
                    break;
                case 'e':
                    set.remove(Integer.parseInt(s[1]));
                    break;
                case 'h':
                    if (set.contains(Integer.parseInt(s[1]))) {
                        sb.append(1).append("\n");
                    } else {
                        sb.append(0).append("\n");
                    }
                    break;
                case 'o':
                    if (set.contains(Integer.parseInt(s[1]))) {
                        set.remove(Integer.parseInt(s[1]));
                    } else {
                        set.add(Integer.parseInt(s[1]));
                    }
                    break;
                case 'l':
                    set.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10,
                            11, 12, 13, 14, 15, 16, 17, 18, 19, 20));
                    break;
                case 'm':
                    set.clear();
                    break;
            }
        }
        System.out.println(sb);
    }
}