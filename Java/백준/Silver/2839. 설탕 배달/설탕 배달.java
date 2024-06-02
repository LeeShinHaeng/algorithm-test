import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inp = scanner.nextInt();

        System.out.println(sugarDelivery(inp));
    }

    private static int sugarDelivery(int inp) {
        int a = 5, b= 3;
        int i = inp / a, j = 0;
        
        while (true){
            int tmp = a*i + b*j;
            if (tmp == inp){
                return i+j;
            } else if (tmp > inp){
                i--;
                j++;
            } else {
                j++;
            }

            if (i < 0){
                return -1;
            }
        }
    }
}