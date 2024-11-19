class Solution {
    public int[] solution(String s) {
        int count = 0;
        int countZero = 0;
        StringBuilder sb = new StringBuilder();
        
        while(true){
            count++;
            sb = new StringBuilder();
            for(int i = 0; i < s.length(); i++){
                char c = s.charAt(i);
                if(c == '1'){
                    sb.append(c);
                } else {
                    countZero++;
                }
            }
            
            int len = sb.toString().length();
            if(len == 1){
                break;
            }
            s = Integer.toBinaryString(len);
        }
        
        return new int[]{count, countZero};
    }
}