import java.util.*;

class Solution {
    public int solution(int n, int[][] computers) {
        boolean[] visited = new boolean[n];
        int answer = 0;
        Queue<Integer> que = new LinkedList<>();
        
        for(int i = 0; i < n; i++){
            if(visited[i]){
                continue;
            }
            que.offer(i);
            visited[i] = true;
            
            while(! que.isEmpty()){
                int cur = que.poll();
                for(int k = 0; k < n; k++){
                    if(visited[k] || que.contains(k)){
                        continue;
                    }
                    if(computers[cur][k] == 1){
                        visited[k] = true;
                        que.offer(k);
                    }
                }
            }
            answer++;
        }
        
        return answer;
    }
}