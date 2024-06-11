import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.printf("%.6f", majorGrade());
    }

    public static float majorGrade() {
        Scanner scanner = new Scanner(System.in);
        float sum = 0;
        int weightSum = 0;

        for (int i = 0; i < 20; i++) {
            String tmp = scanner.next();
            float weight = scanner.nextFloat();
            String grade = scanner.next();

            weightSum += weight;

            switch (grade) {
                case "P" :
                    weightSum -= weight;
                    break;
                case "A+":
                    sum += weight * (4.5);
                    break;
                case "A0" :
                    sum += weight * (4.0);
                    break;
                case "B+" :
                    sum += weight * (3.5);
                    break;
                case "B0" :
                    sum += weight * (3.0);
                    break;
                case "C+" :
                    sum += weight * (2.5);
                    break;
                case "C0" :
                    sum += weight * (2.0);
                    break;
                case "D+" :
                    sum += weight * (1.5);
                    break;
                case "D0" :
                    sum += weight * (1.0);
                    break;
                case "F" :
                    break;
            }
        }
        return sum / weightSum;
    }
}
