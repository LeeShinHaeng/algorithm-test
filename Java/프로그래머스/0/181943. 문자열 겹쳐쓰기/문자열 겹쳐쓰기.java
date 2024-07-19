class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        StringBuilder answer = new StringBuilder();
        answer.append(my_string.substring(0, s));
        answer.append(overwrite_string);
        
        int len = my_string.length();
        int len2 = overwrite_string.length();
        len2 += s;
        answer.append(my_string.substring(len2, len));
        
        return answer.toString();
    }
}