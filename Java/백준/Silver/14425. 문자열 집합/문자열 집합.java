import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        stringSet();
    }

    static public void stringSet() {
        Scanner scanner = new Scanner(System.in);

        int numOfSet = scanner.nextInt();
        int numOfStrings = scanner.nextInt();
        String[] stringSets = new String[numOfSet];
        String tmp;

        int count = 0;

        for(int i = 0; i < numOfSet; i++){
            stringSets[i] = scanner.next();
        }

        for(int i = 0; i < numOfStrings; i++){
            tmp = scanner.next();
            for(int j = 0; j < numOfSet; j++){
                if (stringSets[j].equals(tmp)){
                    count++;
                }
            }
        }

        System.out.println(count);

    }
}