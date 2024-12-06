class Solution {
    public int solution(String str1, String str2) {
        int len1 = str1.length();
        int len2 = str2.length();
        
        for(int i = 0; i < len2; i++){
            int j = 0;
            int pointer = i;
            for(j = 0; j < len1; j++){
                if(pointer >= len2)
                    break;
                
                if(str1.charAt(j) != str2.charAt(pointer++))
                    break;
            }
            if(j >= len1)
                return 1;
        }
        return 0;
    }
}