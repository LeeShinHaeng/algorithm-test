import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(numberOfWords());
    }

    static public int numberOfWords(){
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int count = 0;
        int first = 0, last = input.length();

        if(input.charAt(0) == ' '){
            first++;
            if(last == 1){
                return 0;
            }
        }
        if(input.charAt(input.length() - 1) == ' '){
            last = input.length() - 1;
        }

        for(int i = first; i < last; i++){
            if (input.charAt(i) == ' ') {
                count++;
            }
        }

        return ++count;
    }
}