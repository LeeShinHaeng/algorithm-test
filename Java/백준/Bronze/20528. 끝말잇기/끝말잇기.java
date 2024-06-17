import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        System.out.println(multipleToSum());
    }

    static int multipleToSum() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());
        String[] strings = new String[size];

        String inputStream = br.readLine();
        StringTokenizer st = new StringTokenizer(inputStream);
        for (int i = 0; i < size; i++) {
            strings[i] = st.nextToken();
        }

        char key = inputStream.charAt(0);
        for (int i = 0; i < size; i++) {
            if (strings[i].charAt(0) != key || strings[i].charAt(strings[i].length() - 1) != key) {
                return 0;
            }
        }

        return 1;
    }
}