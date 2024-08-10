public class Main {
    public static void main(String[] args) {
        System.out.println("n e\n" +
                "- -----------");

        System.out.println(0 + " " + 1);
        System.out.println(1 + " " + 2);
        System.out.println(2 + " " + 2.5);

        double before = 2.5;
        for (int i = 3; i <= 9; i++) {
            int cur = 1;
            for (int j = 1; j <= i; j++) {
                cur *= j;
            }
            double ans = (double) 1 / cur;

            ans += before;
            System.out.printf("%d %.9f\n", i, ans);
            before = ans;
        }

    }
}