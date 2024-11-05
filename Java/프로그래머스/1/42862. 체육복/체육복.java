import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        // 각 학생이 가진 체육복 수
        int[] clothes = new int[n+1];
        Arrays.fill(clothes, 1);
        
        // 도난당한 경우 -1, 여벌은 +1
        for(int l: lost){
            clothes[l]--;
        }
        
        for(int r: reserve){
            clothes[r]++;
        }
        
        // 체육복 빌려주기
        for(int i = 1; i <= n; i++){
            if(clothes[i] < 1){
                // 앞
                if(i > 1 && clothes[i-1] > 1){
                    clothes[i]++;
                    clothes[i-1]--;
                }   
                // 뒤
                else if(i < n && clothes[i+1] > 1){
                    clothes[i]++;
                    clothes[i+1]--;
                } 
            }
        }
        
        int answer = -1; // 0번을 빼기 위해 -1로 초기화
        for(int c: clothes){
            if(c > 0){
                answer++;
            }
        }
        
        return answer;
    }
}