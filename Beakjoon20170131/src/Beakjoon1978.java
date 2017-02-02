import java.util.Scanner;
public class Beakjoon1978 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int temp = 0;
      int count = 0;
      for(int i=0; i<n; i++) {
         temp = sc.nextInt();
         if(temp==1) {
            count++;
         } else {
            for(int j=2; j<=temp/2; j++) {
               if(temp%j==0) {
                  count++;
                  break;
               }
            }
         }
      }
      System.out.println(n-count);
   }

}