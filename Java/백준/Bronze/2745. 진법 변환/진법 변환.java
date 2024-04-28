import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        toDecimal();
    }

    static public void toDecimal(){
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        int sys = scanner.nextInt();
        int tmp = 0;
        int result = 0;

        for(int i = 0; i < input.length(); i++){
            char inputChar = input.charAt(i);
            if(inputChar >= '0' && inputChar <= '9'){
                tmp = inputChar - '0';
            } else{
                tmp = inputChar - 'A' + 10;
            }
            result += tmp * Math.pow(sys, (input.length() - (i + 1) ) );
        }
        System.out.println(result);
    }
}