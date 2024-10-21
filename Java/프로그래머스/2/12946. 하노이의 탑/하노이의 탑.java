import java.util.*;
class Solution {
    private ArrayList<int[]> moveList = new ArrayList<>();
    public int[][] solution(int n) {
        hanoi(n, 1, 3, 2);
        int[][] answer = new int[moveList.size()][2];
        for(int i = 0; i < moveList.size(); i++){
            answer[i] = moveList.get(i);
        }
        return answer;
    }
    
    private void hanoi(int n, int from, int to, int middle){
        if(n == 1){
            moveList.add(new int[]{from, to});
            return;
        }
        
        // n-1개를 중간 기둥으로 옮김
        hanoi(n-1, from, middle, to);
        
        // 가장 큰 원판을 목표 기둥으로 옮김
        moveList.add(new int[]{from, to});
        
        // n-1개를 중간 기둥에서 목표 기둥으로 옮김
        hanoi(n-1, middle, to, from);
    }
}