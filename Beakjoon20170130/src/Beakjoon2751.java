import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Beakjoon2751 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> l = new ArrayList<Integer>();
        for(int i=0; i<n; i++) {
            l.add(sc.nextInt());
        }
        Collections.sort(l);
        for(int i: l) {
            System.out.println(i);
        }
    }
}