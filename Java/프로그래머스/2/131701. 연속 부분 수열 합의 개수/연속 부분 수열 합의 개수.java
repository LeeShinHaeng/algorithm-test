import java.util.*;

class Solution {
    public int solution(int[] elements) {
        int n = elements.length;
        Set<Integer> set = new HashSet<>();
        for(int i = 1; i <= n; i++){
            for(int j = 0; j < n; j++){
                int sum = 0;
                for(int k = 0; k < i; k++){
                    sum += elements[(j+k) % n];
                }
                set.add(sum);
            }
        }
        
        return set.size();
    }
}