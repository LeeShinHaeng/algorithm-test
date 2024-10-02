class Solution {
    public long[] solution(long n) {
        String num = n + "";
        long[] answer = new long[num.length()];
        int i = 0;
        
        while(n > 0){
            answer[i] = n % 10;
            n /= 10;
            i++;
        }
        
        return answer;
    }
}