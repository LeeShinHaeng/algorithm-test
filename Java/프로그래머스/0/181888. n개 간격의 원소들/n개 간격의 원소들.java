class Solution {
    public int[] solution(int[] num_list, int n) {
        int len = num_list.length;
        int size = (int) Math.ceil((double) len / n);
        int[] answer = new int[size];
        int pointer = 0;
        
        for(int i = 0; i < len; i += n){
            answer[pointer++] = num_list[i];
        }
        
        return answer;
    }
}