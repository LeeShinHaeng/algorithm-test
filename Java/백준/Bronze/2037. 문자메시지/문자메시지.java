import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

// https://www.acmicpc.net/problem/2037
class Main {
    public static void main(String[] args) throws Exception {
        String[] group = new String[9];
        group[0] = "ABC";
        group[1] = "DEF";
        group[2] = "GHI";
        group[3] = "JKL";
        group[4] = "MNO";
        group[5] = "PQRS";
        group[6] = "TUV";
        group[7] = "WXYZ";
        group[8] = " ";

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] strings = br.readLine().split(" ");
        int p = Integer.parseInt(strings[0]);
        int w = Integer.parseInt(strings[1]);

        Map<Character, Integer> map = new HashMap();
        map.put('A', p);
        map.put('B', 2 * p);
        map.put('C', 3 * p);
        map.put('D', p);
        map.put('E', 2 * p);
        map.put('F', 3 * p);
        map.put('G', p);
        map.put('H', 2 * p);
        map.put('I', 3 * p);
        map.put('J', p);
        map.put('K', 2 * p);
        map.put('L', 3 * p);
        map.put('M', p);
        map.put('N', 2 * p);
        map.put('O', 3 * p);
        map.put('P', p);
        map.put('Q', 2 * p);
        map.put('R', 3 * p);
        map.put('S', 4 * p);
        map.put('T', p);
        map.put('U', 2 * p);
        map.put('V', 3 * p);
        map.put('W', p);
        map.put('X', 2 * p);
        map.put('Y', 3 * p);
        map.put('Z', 4 * p);
        map.put(' ', p);

        String s = br.readLine();
        char c;
        int nowGroup = -1;
        int beforeGroup = -1;
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            c = s.charAt(i);
            count += map.get(c);
            for(int j = 0; j < group.length; j++) {
                if(group[j].contains(String.valueOf(c))) {
                    nowGroup = j;
                    break;
                }
            }
            if(nowGroup == beforeGroup && nowGroup != 8) {
                count+= w;
            }
            beforeGroup = nowGroup;
        }
        System.out.println(count);
    }
}
