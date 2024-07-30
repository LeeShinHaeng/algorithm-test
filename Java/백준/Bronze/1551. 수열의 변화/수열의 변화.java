import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int n = Integer.parseInt(s[0]);
        int k = Integer.parseInt(s[1]);

        s = br.readLine().split(",");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(s[i]);
        }
        int[] output = changeArr(arr, k);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n - k; i++) {
            sb.append(output[i]).append(",");
        }

        System.out.println(sb.deleteCharAt(sb.length() - 1));
    }

    private static int[] changeArr(int[] arr, int k) {
        if (k == 0) {
            return arr;
        }
        int[] newArr = new int[arr.length - 1];

        for (int i = 0; i < newArr.length; i++) {
            newArr[i] = arr[i + 1] - arr[i];
        }
        return changeArr(newArr, k - 1);
    }
}