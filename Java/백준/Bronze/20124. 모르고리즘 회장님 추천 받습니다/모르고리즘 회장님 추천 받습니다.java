import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, Integer> map = new HashMap<>();

        int tc = Integer.parseInt(br.readLine());
        for (int i = 0; i < tc; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            int n = Integer.parseInt(st.nextToken());
            map.put(name, n);
        }
        
        List<String> set = new ArrayList<>(map.keySet().stream().collect(Collectors.toList()));

        set.sort((o1, o2) -> {
            if (Objects.equals(map.get(o1), map.get(o2))) {
                return o1.compareTo(o2);
            }
            return map.get(o2) - map.get(o1);
        });

        System.out.println(set.get(0));
    }
}