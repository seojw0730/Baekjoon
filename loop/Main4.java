package loop;

import java.util.Scanner;

public class Main4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = sc.nextInt();
		int num = sc.nextInt();
		int sum2 = 0;
		for (int i = 0; i < num; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = a * b;
			sum2 += c;
		}
		sc.close();
		if (sum == sum2) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}