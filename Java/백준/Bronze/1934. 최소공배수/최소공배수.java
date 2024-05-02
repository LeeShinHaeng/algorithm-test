import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        lcm();
    }

    static public void lcm() {
        Scanner scanner = new Scanner(System.in);

        int numOfMap = scanner.nextInt();

        for(int i = 0; i < numOfMap; i++){
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            if(a <= b){
                System.out.println(computeLcm(a, b));
            } else {
                System.out.println(computeLcm(b, a));
            }
        }

    }

    private static int computeLcm(int a, int b) {
        if(a == 1){
            return b;
        }

        return (a*b) / gcd(a, b);
    }

    public static int gcd(int a, int b){
        if (b==0){
            return a;
        }
        else{
            return gcd(b, a%b);
        }
    }
}