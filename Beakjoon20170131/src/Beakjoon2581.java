import java.util.Scanner;

public class Beakjoon2581 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		boolean findMin = false;
		int sum, min;
		sum = min = -1;
		for (int i = m; i <= n; i++) {
			if (isPrime(i)) {
				if (!findMin) {
					min = i;
					findMin = true;
				}
				sum += i;
			}
		}
		if (sum != -1) {
			System.out.println(sum+1);
		}
		System.out.println(min);
	}

	public static boolean isPrime(int num) {
		if (num == 1 || num == 0)
			return false;
		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0)
				return false;
		}
		return true;
	}
}