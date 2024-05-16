import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(substringSum());
    }

    private static int substringSum() {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        for(int i = 0; i < input; i++){
            int candidate = i;
            int tmp = i;
            while(tmp > 0){
                candidate += tmp%10;
                tmp /= 10;
            }
            if(candidate == input){
                return i;
            }
        }
        return 0;
    }
}

