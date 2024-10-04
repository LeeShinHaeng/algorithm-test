import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

class Main {
    static int[][] matrix;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                matrix[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        calculate(n);

        System.out.println(matrix[0][0]);
    }

    private static void calculate(int n) {
        if(n == 0){
            return;
        }
        for (int i = 0; i < n / 2; i++) {
            for (int j = 0; j < n / 2; j++) {
                findSecond(i, j);
            }
        }
        calculate(n / 2);

    }

    private static void findSecond(int i, int j) {
        int[] nums = new int[4];
        nums[0] = matrix[i * 2][j * 2];
        nums[1] = matrix[i * 2 + 1][j * 2];
        nums[2] = matrix[i * 2][j * 2 + 1];
        nums[3] = matrix[i * 2 + 1][j * 2 + 1];

        Arrays.sort(nums);
        matrix[i][j] = nums[2];
    }
}