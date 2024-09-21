import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] s;
        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            s = br.readLine().split(" ");
            String[] time = s[0].split(":");
            int hour = Integer.parseInt(time[0]);
            int min = Integer.parseInt(time[1]);
            min += hour * 60;
            map.put(s[1], map.getOrDefault(s[1], 0) + min);
        }

        for (String string : map.keySet()) {
            int totalTime = map.get(string);
            int bill = 10;
            if (totalTime > 100) {
                int extraTime = totalTime - 100;
                bill += (int) Math.ceil((double) extraTime / 50) * 3;
            }
            map.put(string, bill);
        }

        List<String> list = new ArrayList<>(map.keySet());
        list.sort((o1, o2) -> {
            if (!Objects.equals(map.get(o1), map.get(o2))) {
                return map.get(o2).compareTo(map.get(o1));
            }
            return o1.compareTo(o2);
        });

        StringBuilder sb = new StringBuilder();
        for (String string : list) {
            sb.append(string)
                    .append(" ")
                    .append(map.get(string))
                    .append("\n");
        }
        System.out.println(sb);
    }
}