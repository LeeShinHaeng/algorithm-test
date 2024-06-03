import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(middleNumber());
    }

    private static int middleNumber() {
        Scanner scanner = new Scanner(System.in);
        int[] inp = new int[3];
        for (int i = 0; i < 3; i++) {
            inp[i] = scanner.nextInt();
        }
        int tmp;
        for(int j = 0; j < 3; j++){
            for(int i = 0; i < 2; i++){
                if(inp[i] > inp[i+1]){
                    tmp = inp[i];
                    inp[i] = inp[i+1];
                    inp[i+1] = tmp;
                }
            }
        }
        return inp[1];
    }
}