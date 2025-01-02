class Solution {
    public int solution(String s) {
        int answer = 0;
        int len = s.length();
        int key = 0;
        int count = 0;
        char target = 'A';
        
        for(int i = 0; i < len; i++){
            if(key == 0){
                target = s.charAt(i);
                key++;
                continue;
            }
            if(target == s.charAt(i))
                key++;
            else 
                count++;
            
            if(key == count){
                answer++;
                key = 0;
                count = 0;
            }
        }
        
        return key > 0 ? answer + 1 : answer;
    }
}