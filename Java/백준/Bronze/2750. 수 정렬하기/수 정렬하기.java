import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        beeHouse();
    }

    static public void beeHouse() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        for(int i = 0; i < n; i++){
            numbers[i] = scanner.nextInt();
        }

        for(int i = 0; i < n; i++){
            for(int j = 0; j < i; j++){
                if(i == j){
                    break;
                }

                if(numbers[i] < numbers[j]){
                    int tmp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = tmp;
                }

            }
        }

        for(int number : numbers){
            System.out.println(number);
        }

    }
}