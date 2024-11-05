class Solution {
    public int solution(String name) {
        int answer = 0;
        
        int len = name.length();
        int minMove = len - 1;
        
        for(int i = 0; i < len; i++){
            char target = name.charAt(i);
            int upDownCount = Math.min(target - 'A', 'Z' - target + 1);
            answer += upDownCount;
        
            // 다음 문자가 A일때
            int nextIndex = i+1;
            while(nextIndex < len && name.charAt(nextIndex) =='A'){
                nextIndex++;
            }

            // A가 연속될때
            minMove = Math.min(minMove, i*2 + name.length() - nextIndex);
            minMove = Math.min(minMove, (name.length() - nextIndex)*2 + i);
        }
        
        answer += minMove;
        return answer;
    }
}