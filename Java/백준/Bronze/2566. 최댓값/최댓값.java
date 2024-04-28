import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        findMaxInSquare();
    }

    static public void findMaxInSquare(){
        Scanner scanner = new Scanner(System.in);
        int tmp = 0;
        int maxI = 0;
        int maxJ = 0;
        int maxValue = 0;

        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){
                tmp = scanner.nextInt();
                if(i==0 && j==0){
                    maxValue = tmp;
                }

                if(maxValue < tmp){
                    maxI = i;
                    maxJ = j;
                    maxValue = tmp;
                }
            }
        }

        System.out.println(maxValue);
        System.out.println(++maxI + " " + ++maxJ);
    }
}