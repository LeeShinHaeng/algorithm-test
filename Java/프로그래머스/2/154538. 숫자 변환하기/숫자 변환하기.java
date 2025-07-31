import java.util.*;

class Solution {
    public int solution(int x, int y, int n) {
        int[] steps = new int[y+1];
        Arrays.fill(steps, -1);
        
        Queue<Integer> q = new LinkedList<>();
        q.add(x);
        
        steps[x] = 0;
        while(!q.isEmpty()){
            int cur = q.poll();
            if(cur == y) break;
            
            int[] nexts = {cur + n, cur * 2, cur * 3};
            for(int nx: nexts){
                if(nx <= y && steps[nx] == -1){
                    steps[nx] = steps[cur] + 1;
                    q.add(nx);
                }
            }
        }
        
        return steps[y];
    }
}