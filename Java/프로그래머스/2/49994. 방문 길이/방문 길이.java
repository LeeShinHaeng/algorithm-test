import java.util.*;

class Solution {
    public int[] dx = {1, -1, 0, 0};
    public int[] dy = {0, 0, 1, -1};
    public Map<Character, Integer> mapping = new HashMap<>();
    
    public int solution(String dirs) {
        int curX = 5;
        int curY = 5;
        mapping.put('U', 0);
        mapping.put('D', 1);
        mapping.put('L', 2);
        mapping.put('R', 3);
        Set<String> visited = new HashSet<>();
        
        int answer = 0;
        for(int i = 0; i < dirs.length(); i++){
            char dir = dirs.charAt(i);
            int n = mapping.get(dir);
            int nx = curX + dx[n];
            int ny = curY + dy[n];
            
            if(nx < 0 || nx > 10 || ny < 0 || ny > 10)
                continue;
            
            String key1 = curX + " " + curY + " " + nx + " " + ny;
            String key2 = nx + " " + ny + " " + curX + " " + curY;
            
            if(visited.contains(key1) || visited.contains(key2))
                answer--;
            
            visited.add(key1);
            visited.add(key2);
            curX = nx;
            curY = ny;
            answer++;
        }
        
        return answer;
    }
}