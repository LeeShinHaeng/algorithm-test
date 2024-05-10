import java.util.*;

public class Main {
    public static void main(String[] args){
        stackSum();
    }

    private static void stackSum(){
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i < num; i++){
            int inp = scanner.nextInt();
            if(inp == 0){
                stack.pop();
            } else {
                stack.push(inp);
            }
        }
        int sum = 0;
        while(! stack.isEmpty()) {
            sum += stack.pop();
        }

        System.out.println(sum);
    }
}