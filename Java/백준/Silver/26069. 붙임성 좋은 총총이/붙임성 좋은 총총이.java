import java.util.*;

public class Main {
    private static String chongChong = "ChongChong";

    public static void main(String[] args){
        countDancer();
    }

    private static void countDancer(){
        HashSet<String> names = new HashSet<>();
        names.add(chongChong);

        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        for(int i = 0; i < num; i++){
            String personA = scanner.next();
            String personB = scanner.next();
            if(personA.equals(chongChong)){
                names.add(personB);
            } else if(personB.equals(chongChong)){
                names.add(personA);
            } else if(names.contains(personA) || names.contains(personB)) {
                names.add(personA);
                names.add(personB);
            }
        }
        System.out.println(names.size());
    }
}