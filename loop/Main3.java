package loop;

import java.util.Scanner;

public class Main3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		int sum = 0;
		for (int i = 0; i < n; i++) {
			sum += (i + 1);
		}
		System.out.println(sum);
	}
}