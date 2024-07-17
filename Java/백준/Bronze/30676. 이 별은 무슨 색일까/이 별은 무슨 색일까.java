import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine());

        if (input >= 620) {
            System.out.println("Red");
            return;
        }
        if (input >= 590) {
            System.out.println("Orange");
            return;
        }
        if (input >= 570) {
            System.out.println("Yellow");
            return;
        }
        if (input >= 495) {
            System.out.println("Green");
            return;
        }
        if (input >= 450) {
            System.out.println("Blue");
            return;
        }
        if (input >= 425) {
            System.out.println("Indigo");
            return;
        }
        System.out.println("Violet");

    }
}