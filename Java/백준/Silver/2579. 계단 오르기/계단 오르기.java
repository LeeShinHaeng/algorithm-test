import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(stepItUp());
    }

    private static int stepItUp() {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] steps = new int[size + 4];
        int[] score = new int[size + 4];

        for (int i = 0; i < size; i++) {
            steps[i + 1] = scanner.nextInt();
        }

        score[1] = steps[1];
        score[2] = steps[1] + steps[2];
        score[3] = Math.max(steps[1], steps[2]) + steps[3];

        for (int i = 4; i <= size; i++){
            score[i] = Math.max(score[i-3] + steps[i-1], score[i-2]) + steps[i];
        }

        return score[size];
    }
}