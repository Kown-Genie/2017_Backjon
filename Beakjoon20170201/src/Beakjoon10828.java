import java.util.Scanner;
import java.util.ArrayList;
public class Beakjoon10828 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack stack = new Stack();
        int t = sc.nextInt();
        for(int i=0; i<t; i++) {
            String order = sc.next();
            if(order.equals("push")) {
                stack.push(sc.nextInt());
            } else if(order.equals("pop")) {
                System.out.println(stack.pop());
            } else if(order.equals("size")) {
                System.out.println(stack.size());
            } else if(order.equals("empty")) {
                System.out.println(stack.empty());
            } else if(order.equals("top")) {
                System.out.println(stack.top());
            }
        }
        
    }
}

class Stack {
    public ArrayList<Integer> list = new ArrayList<Integer>();
    
    public void push(int i) {
        list.add(i);
    }
    
    public int pop() {
        if(list.size()>0) {
            int temp = list.get(list.size()-1);
            list.remove(list.size()-1);
            return temp;
        }
        return -1;
    }
    
    public int size() {
        return list.size();
    }
    
    public int empty() {
        if(list.size()>0)
            return 0;
        return 1;
    }
    
    public int top() {
        if(list.size()>0)
            return list.get(list.size()-1);
        return -1;
    }    
}