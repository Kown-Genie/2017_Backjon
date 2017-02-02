import java.util.Scanner;
public class January0129_1193 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int count = 0;
        int sum;
        do {
            count++;
            sum = count*(count+1)/2;
        } while(input>sum);
        if(count%2==1) {
        	System.out.println((1+(sum-input))+"/"+(count-(sum-input)));
        } else {
        	System.out.println((count-(sum-input))+"/"+(1+(sum-input)));
        }
    }
}