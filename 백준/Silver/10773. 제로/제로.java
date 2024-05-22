import java.util.Stack;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        
        for (int i = 0; i < k; i++) {
            int n = sc.nextInt();
            if (n != 0) {
                stack.push(n);
            } else {
                stack.pop();
            }
        }        
        int sum = 0;
        while (!stack.empty()) {
            sum += stack.pop();
        }
        System.out.println(sum);
    }
}