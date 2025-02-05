class Solution {
    public String solution(int n) {
        StringBuilder answer = new StringBuilder();
        
        while(n > 0){
            if(n % 3 == 0){
                answer.append(4);
                n = n / 3 - 1;
                continue;
            }
            answer.append(n%3);
            n = n / 3;
        }
        
        return answer.reverse().toString();
    }
}