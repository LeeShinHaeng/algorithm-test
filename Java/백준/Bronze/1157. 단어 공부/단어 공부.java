import java.util.Scanner;

public class Main {
    static final int[] counter = new int[26];
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        alphabetCounter(input);
    }

    private static void alphabetCounter(String input){
        for(int i = 0; i < input.length(); i++){
            char tmp = input.charAt(i);
            if(tmp >= 'a' && tmp <= 'z'){
                counter[tmp - 'a']++;
            } else {
                counter[tmp - 'A']++;
            }
        }

        System.out.println(findMax());
    }

    private static char findMax() {
        int max = -1;
        char result = '?';
        for (int i = 0; i < counter.length; i++) {
            if(counter[i] > max){
                max = counter[i];
                result = (char)('A' + i);
            } else if (counter[i] == max) {
                result = '?';
            }
        }

        return result;
    }
}