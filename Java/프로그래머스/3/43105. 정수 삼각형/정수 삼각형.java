class Solution {
    public int solution(int[][] tri) {
        int h = tri.length;
        
        if(h == 1) return tri[0][0];
        
        for(int i = 1; i < h; i++){
            for(int j = 0; j < i+1; j++){
                if(j == 0) // i번째 행 제일 왼쪽
                    tri[i][j] += tri[i-1][j];
                else if(j == i) // i번째 행 제일 오른쪽
                    tri[i][j] += tri[i-1][j-1];
                else
                    tri[i][j] += Math.max(tri[i-1][j], tri[i-1][j-1]);
            }
        }
        
        int max = 0;
        for(int i = 0; i < h; i++)
            max = Math.max(max, tri[h-1][i]);
        return max;
    }
}