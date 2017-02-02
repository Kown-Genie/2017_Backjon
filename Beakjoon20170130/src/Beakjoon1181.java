import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Beakjoon1181 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        ArrayList<String> list = new ArrayList<String>();
        for(int testCase=0; testCase<t; testCase++) {
            list.add(sc.next());
        }
        Collections.sort(list);
        
        for(int i=0; i<t; i++) {
            String temp;
            for(int j=i+1; j<t; j++) {
                if(list.get(i).length()>list.get(j).length()) {
                	temp = list.get(i);
                	list.remove(i);
                	list.add(i, list.get(j-1));
                	list.remove(j);
                	list.add(i+1, temp);
                } else if(list.get(i).equals(list.get(j))) {
                	list.remove(j--);
                	t--;
                }
            }
        }
        for(String word : list) {
            System.out.println(word);
        }
    }
}