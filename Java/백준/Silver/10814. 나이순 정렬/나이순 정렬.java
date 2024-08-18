import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        ArrayList<User> users = new ArrayList<>();

        for (int i = 0; i < tc; i++) {
            String[] s = br.readLine().split(" ");
            users.add(new User(Integer.parseInt(s[0]), s[1], i));
        }

        users.sort((o1, o2) -> {
            if (o1.age == o2.age) {
                return o1.count - o2.count;
            }
            return o1.age - o2.age;
        });

        for (User user : users) {
            System.out.println(user.toString());
        }
    }

    private static class User {
        int age;
        String name;
        int count;

        User(int age, String name, int count) {
            this.age = age;
            this.name = name;
            this.count = count;
        }

        @Override
        public String toString() {
            return age + " " + name;
        }
    }
}