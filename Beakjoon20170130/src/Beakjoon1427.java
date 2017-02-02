import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;


public class Beakjoon1427 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      ArrayList<Integer> list = new ArrayList<Integer>();
      while(n>0) {
         list.add(n%10);
         n /= 10;
      }
      Collections.sort(list);
      for(int i=list.size()-1; i>=0; i--) {
         System.out.print(list.get(i));
      }
   }
}