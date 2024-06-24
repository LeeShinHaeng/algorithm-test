import java.io.*;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        makeQueue();
    }

    public static void makeQueue() throws IOException {
        LinkedList<Integer> queue = new LinkedList<>();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            StringTokenizer st = new StringTokenizer(s);
            String s1 = st.nextToken();

            if (s1.equals("push")) {
                queue.add(Integer.parseInt(st.nextToken()));
                continue;
            }
            if (s1.equals("pop")) {
                if (queue.isEmpty()) {
                    sb.append("-1\n");
                } else {
                    sb.append(queue.poll()).append("\n");
                }
                continue;
            }
            if (s1.equals("size")) {
                sb.append(queue.size()).append("\n");
                continue;
            }
            if (s1.equals("empty")) {
                sb.append(queue.isEmpty() ? 1 : 0).append("\n");
                continue;
            }
            if (s1.equals("front")) {
                if (queue.isEmpty()) {
                    sb.append("-1\n");
                } else {
                    sb.append(queue.peek()).append("\n");
                }
                continue;
            }
            if (queue.isEmpty()) {
                sb.append("-1\n");
            } else {
                sb.append(queue.peekLast()).append("\n");
            }
        }
        bw.write(sb.toString());
        bw.flush();
    }
}