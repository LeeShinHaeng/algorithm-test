import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < a.length(); i++){
            char c = a.charAt(i);
            if(c >= 'a' && c <= 'z'){
                c -= 32;
            }else {
                c += 32;
            }
            
            sb.append(c);
        }
        
        System.out.println(sb);
    }
}