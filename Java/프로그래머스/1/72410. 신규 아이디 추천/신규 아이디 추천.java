class Solution {
    public String solution(String new_id) {
        String s1 = new_id.toLowerCase();
        
        StringBuilder sb2 = new StringBuilder();
        for(int i = 0; i < s1.length(); i++){
            char c = s1.charAt(i);
            if((c >= 'a' && c <= 'z')
              || (c >= '0' && c <= '9')
              || c == '.' || c == '-' || c == '_' )
                sb2.append(c);
        }
        
        String s2 = sb2.toString();
        while (s2.contains("..")) {
            s2 = s2.replace("..", ".");
        }
        
        if (s2.length() > 0 && s2.charAt(0) == '.') {
            s2 = s2.substring(1);
        }
        if (s2.length() > 0 && s2.charAt(s2.length() - 1) == '.') {
            s2 = s2.substring(0, s2.length() - 1);
        }
        
        if(s2.length() <= 0){
            s2 = "a";
        }
        
        if(s2.length() > 15){
            s2 = s2.substring(0, 15);
        }
        
        if (s2.charAt(s2.length() - 1) == '.') {
            s2 = s2.substring(0, s2.length() - 1);
        }
        
        while(s2.length() < 3){
            s2 += s2.charAt(s2.length()-1);    
        }
        
        System.out.println(s2);
        return s2;
    }
}