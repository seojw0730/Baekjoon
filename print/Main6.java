package print;

import java.util.Scanner;

public class Main6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b;
		a = sc.nextInt();
		b = sc.nextInt();
		sc.close();
		int b1 = b / 100;
		int b2 = b / 10 - 10 * b1;
		int b3 = b - 100 * b1 - 10 * b2;
		System.out.println(a * b3);
		System.out.println(a * b2);
		System.out.println(a * b1);
		System.out.println(a * b);
	}
}