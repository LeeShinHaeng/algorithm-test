import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        whoDidntSubmit();
    }

    static public void whoDidntSubmit(){
        Scanner scanner = new Scanner(System.in);
        boolean[] submitted = new boolean[30];
        int inp = -1;

        for(int i = 0; i < submitted.length - 2; i++){
            inp = scanner.nextInt();
            submitted[inp-1] = true;
        }

        for(int i = 0; i < submitted.length; i++){
            if(! submitted[i]){
                System.out.println(i+1);
            }
        }
    }
}