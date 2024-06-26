import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        ArrayList<BigInteger> nums = new ArrayList<>();
        StringBuilder num = new StringBuilder();
        for (int i = 0; i < n; i++) {
            String input = br.readLine();

            for (int j = 0; j < input.length(); j++) {
                if (input.charAt(j) >= '0' && input.charAt(j) <= '9') {
                    num.append(input.charAt(j));
                } else if (num.length() > 0) {
                    nums.add(new BigInteger(num.toString()));
                    num.delete(0, num.length());
                }
            }
            if (num.length() > 0) {
                nums.add(new BigInteger(num.toString()));
                num.delete(0, num.length());
            }
        }
        Collections.sort(nums);
        for (BigInteger integer : nums) {
            System.out.println(integer);
        }
    }
}