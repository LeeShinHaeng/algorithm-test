import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        printStars();
    }

    static public void printStars(){
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        for (int i = 0; i < input; i++){
            iterationPart(input, i);
        }

        for (int i = input-2; i >= 0; i--){
            iterationPart(input, i);
        }
    }

    private static void iterationPart(int input, int i) {
        for(int j = input - i; j > 1; j--){
            System.out.print(" ");
        }
        for(int k = 0; k < (2*i + 1); k++){
            System.out.print("*");
        }
        System.out.println();
    }
}