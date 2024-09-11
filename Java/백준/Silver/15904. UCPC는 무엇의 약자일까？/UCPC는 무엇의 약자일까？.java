import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        char c;
        boolean flagU = false, flagC1 = false, flagP = false;
        for (int i = 0; i < s.length(); i++) {
            c = s.charAt(i);
            if (c == 'U') {
                flagU = true;
            }
            if (c == 'C' && flagU) {
                flagC1 = true;
            }
            if (c == 'P' && flagC1) {
                flagP = true;
            }
            if (c == 'C' && flagP) {
                System.out.println("I love UCPC");
                return;
            }
        }

        System.out.println("I hate UCPC");
    }
}