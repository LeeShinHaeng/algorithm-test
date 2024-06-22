import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        maxHeap();
    }

    public static void maxHeap() {
        PriorityQueue<Integer> heap = new PriorityQueue<>(Comparator.reverseOrder());
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            int input = scanner.nextInt();
            if (input == 0) {
                if (heap.isEmpty()) {
                    System.out.println(0);
                    continue;
                }
                System.out.println(heap.poll());
                continue;
            }
            heap.add(input);
        }
    }
}