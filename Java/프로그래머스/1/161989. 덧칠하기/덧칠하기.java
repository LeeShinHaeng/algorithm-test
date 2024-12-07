class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        boolean[] wall = new boolean[n];
        
        for(int i = 0; i < section.length; i++){
            wall[section[i]-1] = true;
        }
        
        while(true){
            boolean flag = false;
            int pointer = 0;
            for(int i = 0; i < n; i++){
                if (wall[i]){
                    flag = true;
                    pointer = i;
                    break;
                }
            }
            if(! flag) break;
            answer++;
            
            for(int i = pointer; i < pointer + m; i++){
                if(i > n-1) break;
                wall[i] = false;
            }
        }
        
        return answer;
    }
    
}