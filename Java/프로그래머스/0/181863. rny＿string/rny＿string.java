class Solution {
    public String solution(String input) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < input.length(); i++){
            char c = input.charAt(i);
            if(c == 'm'){
                sb.append("rn");
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}