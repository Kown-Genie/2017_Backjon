import java.util.Scanner;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] list = new int[10];
		Arrays.fill(list, 0);
		int temp = 0;
		int count = 0;
		int check = 0;
		while(String.valueOf(n).charAt(check)=='0') {
			count++;
			check++;
		}
		while (n > 0) {
			temp = n % 10;
			if(temp==9)
				temp=6;
			list[temp]++;
			
			
			if(list[temp]>count) {
				count++;
				if(temp==9 || temp==6) {
					if((list[6] + list[9]) % 2 == 0)
						count--;
				}
			}
			n /= 10;			
		}
		System.out.println(count);
	}
}