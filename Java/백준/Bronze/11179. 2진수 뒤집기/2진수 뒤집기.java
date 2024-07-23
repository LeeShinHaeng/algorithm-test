import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        ArrayList<Integer> output = new ArrayList<>();

        for(int i = 29; i >= 0; i--) {
            int digit = (int) Math.pow(2, i);
            if(digit > input && output.isEmpty()){
                continue;
            }

            if(digit > input){
                output.add(0);
                continue;
            }
            input -= digit;
            output.add(1);
        }
        
        int result = 0;
        for (int i = 0; i < output.size(); i++) {
            result += output.get(i) * (int) Math.pow(2, i);
        }
        System.out.println(result);
    }
}