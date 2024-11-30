import java.util.*;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        Map<String, Integer> map;
        int max = discount.length - 9;
        int result = 0;
        boolean flag;
        
        for(int i = 0; i < discount.length; i++){
            flag = true;
            map = new HashMap<>();
            for(int j = i; j < i + 10; j++){
                if(j >= discount.length) break;
                map.put(discount[j], map.getOrDefault(discount[j], 0)+1);
            }
            
            for(int j = 0; j < want.length; j++){
                int tmp = map.getOrDefault(want[j], 0);
                if(number[j] > tmp) {
                    flag = false;
                    break;
                }
            }
            
            if(flag)
                result++;
        }
        
        return result;
    }
}
