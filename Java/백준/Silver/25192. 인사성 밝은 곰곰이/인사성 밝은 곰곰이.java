import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        GomGom();
    }

    static public void GomGom() {
        Scanner scanner = new Scanner(System.in);

        int length = scanner.nextInt();
        Set<String> inputs = new HashSet<>();
        int count = 0;

        for(int i = 0; i < length; i++){
            String tmp = scanner.next();
            if(! tmp.equals("ENTER")){
                inputs.add(tmp);
            } else {
                count += inputs.size();
                inputs.clear();
            }
        }
        count += inputs.size();

        System.out.println(count);
    }
}