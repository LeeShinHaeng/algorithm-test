import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        receipt();
    }

    static public void receipt(){
        Scanner scanner = new Scanner(System.in);
        Long x = scanner.nextLong();
        int n = scanner.nextInt();
        int a[] = new int[n];
        int sum = 0;
        for(int i = 0; i < n; i++){
            a[i] = scanner.nextInt() * scanner.nextInt();
            sum += a[i];
        }

        if(x == sum){
            System.out.println("Yes");
        } else{
            System.out.println("No");
        }
    }
}