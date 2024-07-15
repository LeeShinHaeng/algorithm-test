import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int size = Integer.parseInt(br.readLine());

        for (int i = 0; i < size; i++) {
            String[] inputA = br.readLine().split(" ");
            String[] inputB = br.readLine().split(" ");
            String[] inputC = br.readLine().split(" ");
            String[] inputD = br.readLine().split(" ");

            int[] pointA = {Integer.parseInt(inputA[0]), Integer.parseInt(inputA[1])};
            int[] pointB = {Integer.parseInt(inputB[0]), Integer.parseInt(inputB[1])};
            int[] pointC = {Integer.parseInt(inputC[0]), Integer.parseInt(inputC[1])};
            int[] pointD = {Integer.parseInt(inputD[0]), Integer.parseInt(inputD[1])};
            int[][] input = {pointA, pointB, pointC, pointD};

            if (isSquare(input)) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }
    }

    private static boolean isSquare(int[][] input) {
        double[] distance = new double[6];
        int k = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = i + 1; j < 4; j++) {
                int tmpx = (int) Math.pow((input[i][0] - input[j][0]), 2);
                int tmpy = (int) Math.pow((input[i][1] - input[j][1]), 2);
                distance[k] = Math.sqrt(tmpx + tmpy);
                k++;
            }
        }
        Arrays.sort(distance);

        return distance[0] == distance[3] && distance[4] == distance[5];
    }
}