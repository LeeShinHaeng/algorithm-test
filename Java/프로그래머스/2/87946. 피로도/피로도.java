class Solution {
    private static int steps = 0;
    
    public int solution(int k, int[][] dungeons) {
        boolean visited[] = new boolean[dungeons.length];
        
        dfs(k, dungeons, 0, 0, visited);
        return steps;
    }
    
    public void dfs(int k, int[][] ds, int cur, int count, boolean[] visited){
        if(ds.length == cur){
            steps = Math.max(steps, count);
            return;
        }
        
        for(int i = 0; i < ds.length; i++){
            if(visited[i]) continue;
            visited[i] = true;
            
            if(ds[i][0] <= k){
                dfs(k-ds[i][1], ds, cur+1, count+1, visited);
            } else{
                dfs(k, ds, cur+1, count, visited);
            }
            visited[i] = false;
        }
    }
    
}