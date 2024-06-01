import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        fractionsSum();
    }

    private static void fractionsSum() {
        Scanner scanner = new Scanner(System.in);
        int bunja1 = scanner.nextInt();
        int bunmo1 = scanner.nextInt();
        int bunja2 = scanner.nextInt();
        int bunmo2 = scanner.nextInt();

        bunja1 *= bunmo2;
        bunja2 *= bunmo1;

        int bunjaResult = bunja1 + bunja2;
        int bunmoResult = bunmo1 * bunmo2;

        int gcd = computeGcd(bunjaResult, bunmoResult);
        System.out.println(bunjaResult/gcd + " " + bunmoResult/gcd);
    }

    private static int computeGcd(int a, int b){
        if (b==0){
            return a;
        }
        else{
            return computeGcd(b, a%b);
        }
    }
}