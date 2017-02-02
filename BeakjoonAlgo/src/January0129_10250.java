import java.util.Scanner;
public class January0129_10250 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int h, w, n;
        h=w=n=0;
        String result = null;
        for(int i=0; i<t; i++) {
            h = sc.nextInt();
            w = sc.nextInt();
            n = sc.nextInt();
            int row = n%h;
            if(row==0)
                result = h+"";
            else
                result = row+"";
            int col = (n-1)/h+1;
            if(col<10)
                result += "0"+col;
            System.out.println(result);
        }
    }
}