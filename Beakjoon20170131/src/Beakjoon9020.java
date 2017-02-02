import java.util.ArrayList;
import java.util.Scanner;
public class Beakjoon9020 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i=0; i<t; i++) {
            int n = sc.nextInt();
            list.clear();
            for(int j=2; j<=n/2; j++) {
                if(isPrime(j)&&isPrime(n-j))
                    list.add(j);
            }       
            int min = list.get(0);
            for(int j=1; j<list.size(); j++) {
                if(Math.abs(n-min-min)>Math.abs(n-2*list.get(j)))
                    min = list.get(j);
            }
            System.out.println(min + " " + (n-min));
        }
    }
    
    public static boolean isPrime(int num) {
        if(num==0 || num==1)
            return false;
        for(int i=2; i<=Math.sqrt(num); i++) {
            if(num%i==0)
                return false;
        }
        return true;
    }
}