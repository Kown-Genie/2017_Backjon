import java.util.Scanner;
public class Beakjoon2750 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] l = new int[n];
        for(int i=0; i<n; i++) {
            l[i] = sc.nextInt();
        }
        new Beakjoon2750().sort(l);
        for(int i: l) {
            System.out.println(i);
        }
    }
    
    public void sort(int[] l){
        int temp = 0;
        for(int i=0; i<l.length; i++){;
            for(int j=i+1; j<l.length; j++) {
                if(l[i]>l[j]) {
                    l[i] = l[i]+l[j];
                    l[j] = l[i]-l[j];
                    l[i] = l[i]-l[j];
                }
            }
        }
    }
}
