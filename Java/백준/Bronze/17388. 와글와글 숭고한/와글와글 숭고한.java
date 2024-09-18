import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int s = Integer.parseInt(str[0]);
        int k = Integer.parseInt(str[1]);
        int h = Integer.parseInt(str[2]);

        int sum = s + k + h;
        if(sum >= 100){
            System.out.println("OK");
            return;
        }
        if(s < k){
            if(s < h){
                System.out.println("Soongsil");
                return;
            }
        }
        if(k < h){
            if(k < s){
                System.out.println("Korea");
                return;
            }
        }
        System.out.println("Hanyang");
    }
}