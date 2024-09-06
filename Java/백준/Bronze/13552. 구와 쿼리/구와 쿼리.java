import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int numOfDots = Integer.parseInt(br.readLine());
        int[][] dots = new int[numOfDots][3];

        String[] s;
        for (int i = 0; i < numOfDots; i++) {
            s = br.readLine().split(" ");
            dots[i][0] = Integer.parseInt(s[0]);
            dots[i][1] = Integer.parseInt(s[1]);
            dots[i][2] = Integer.parseInt(s[2]);
        }

        StringBuilder sb = new StringBuilder();
        int[] spheres = new int[4];
        int numOfSpheres = Integer.parseInt(br.readLine());
        for (int i = 0; i < numOfSpheres; i++) {
            s = br.readLine().split(" ");
            spheres[0] = Integer.parseInt(s[0]);
            spheres[1] = Integer.parseInt(s[1]);
            spheres[2] = Integer.parseInt(s[2]);
            spheres[3] = Integer.parseInt(s[3]);

            int count = 0;
            for (int j = 0; j < numOfDots; j++) {
                long x = dots[j][0] - spheres[0];
                long y = dots[j][1] - spheres[1];
                long z = dots[j][2] - spheres[2];

                long distance = x * x + y * y + z * z;
                if (distance <= ((long) spheres[3] * spheres[3])) {
                    count++;
                }
            }
            sb.append(count).append("\n");
        }

        System.out.println(sb);
    }
}