import java.util.Scanner;
import java.util.Stack;
public class Beakjoon9012{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        String input;
        for(int i=0; i<t; i++) {
            input = sc.next();
            String[] inputList = input.split("");
            if(isVPS(inputList))
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
    
    public static boolean isVPS(String[] inputList) {
        Stack stack = new Stack();
        for(String input : inputList) {
            if(input.equals("("))
                stack.push("(");
            else if(input.equals(")")) {
                if(!stack.empty() && stack.peek().equals("("))
                    stack.pop();
                else
                    return false;
            }
        }
        if(stack.empty())
            return true;
        else
            return false;
    }
}