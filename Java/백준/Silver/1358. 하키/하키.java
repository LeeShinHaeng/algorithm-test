import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        String[] s = br.readLine().split(" ");
        int w = Integer.parseInt(s[0]);
        int h = Integer.parseInt(s[1]);
        int x = Integer.parseInt(s[2]);
        int y = Integer.parseInt(s[3]);
        int p = Integer.parseInt(s[4]);

        int count = 0;

        for (int i = 0; i < p; i++) {
            String[] players = br.readLine().split(" ");
            int px = Integer.parseInt(players[0]);
            int py = Integer.parseInt(players[1]);
            if (px >= x && py >= y && px <= x + w && py <= y + h) {
                count++;
                continue;
            }

            double r = (double) h / 2;
            double[] pointA = {x, y + r};
            double[] pointB = {x + w, y + r};

            double distanceA = Math.sqrt((pointA[0] - px) * (pointA[0] - px) + (pointA[1] - py) * (pointA[1] - py));
            double distanceB = Math.sqrt((pointB[0] - px) * (pointB[0] - px) + (pointB[1] - py) * (pointB[1] - py));

            if (distanceA <= r || distanceB <= r) {
                count++;
            }
        }
        System.out.println(count);
    }
}