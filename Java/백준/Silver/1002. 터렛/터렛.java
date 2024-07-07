import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int size = Integer.parseInt(br.readLine());
        for (int i = 0; i < size; i++) {
            System.out.println(computeLocation());
        }
    }

    private static int computeLocation() throws IOException {
        String[] inputs = br.readLine().split(" ");
        double x1 = Double.parseDouble(inputs[0]);
        double y1 = Double.parseDouble(inputs[1]);
        double r1 = Double.parseDouble(inputs[2]);
        double x2 = Double.parseDouble(inputs[3]);
        double y2 = Double.parseDouble(inputs[4]);
        double r2 = Double.parseDouble(inputs[5]);

        if (x1 == x2 && y1 == y2 && r1 == r2) {
            return -1;
        }

        double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        if (distance < Math.abs(r1 - r2)) {
            return 0;
        }
        if (distance > r1 + r2) {
            return 0;
        }
        if (distance == Math.abs(r1 - r2)) {
            return 1;
        }
        if (distance == r1 + r2) {
            return 1;
        }
        return 2;
    }
}