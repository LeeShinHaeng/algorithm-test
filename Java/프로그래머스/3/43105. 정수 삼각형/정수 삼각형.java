class Solution {
    public int solution(int[][] tri) {
        int h = tri.length;
        
        if(h == 1){
            return tri[0][0];
        }
        
        // 각 리프 노드까지 최대 합 계산
        for(int i = 1; i < h; i++){
            for(int j = 0; j < tri[i].length; j++){
                if(j == 0){
                    tri[i][j] += tri[i-1][j];
                    continue;
                }
                if(j == i){
                    tri[i][j] += tri[i-1][j-1];
                    continue;
                }
                tri[i][j] += Math.max(tri[i-1][j], tri[i-1][j-1]);
            }
        }
        
        // 구한 합들 중 최대값 찾기
        h -= 1;
        int max = tri[h][0];
        for(int i = 1; i < tri[h].length; i++){
            max = Math.max(max, tri[h][i]);
        }
        return max;
    }
}