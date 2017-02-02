import java.util.Scanner;
public class Beakjoon4948 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        while(true) {
            n = sc.nextInt();
            if(n==0)
            	System.exit(0);
            System.out.println(numPrime(n));
        }
    }
    
    public static int numPrime(int n) {
        int count = 0;
        for(int i=n+1; i<=2*n; i++) {
            if(isPrime(i))
                count++;
        }
        return count;
    }
    
    public static boolean isPrime(int n) {
    	if(n==1 || n==0)
    		return false;
        for(int i=2;i<=Math.sqrt(n); i++) {
            if(n%i==0)
                return false;
        }
        return true;
    }
}