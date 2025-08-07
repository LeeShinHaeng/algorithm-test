class Solution {
    public int[] solution(int[] sequence, int k) {
        int sum = 0, l = 0, r = 0, len = sequence.length, min = len;
        int[] answer = new int[2];

        for(r = 0; r < len; r++){
            sum += sequence[r];
            while(r < len && sum > k)
                sum -= sequence[l++];
            
            if(sum == k && min > r - l){
                min = r - l;
                answer[0] = l;
                answer[1] = r;
            }
        }
    
        return answer;
    }
}