import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(reader.readLine());

        Queue<Integer> deck = new LinkedList<>();
        for (int i = 0; i < size; i++) {
            deck.add(i+1);
        }
        lastCard(deck);
    }

    static void lastCard(Queue<Integer> deck) {
        if(deck.size() <= 1){
            System.out.println(deck.peek());
            return;
        }

        deck.poll();
        int tmp = deck.poll();
        deck.add(tmp);
        lastCard(deck);
    }
}