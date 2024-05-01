import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AvgAndMid();
    }

    static public void AvgAndMid() {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];
        for(int i = 0; i < 5; i++){
            numbers[i] = scanner.nextInt();
        }

        for(int i = 0; i < 5; i++){
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
        int mid = numbers[2];

        int sum = 0;
        for(int number : numbers){
            sum += number;
        }

        System.out.println(sum / 5);
        System.out.println(mid);
    }
}