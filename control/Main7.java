package control;

import java.util.Scanner;

public class Main7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		sc.close();

		if ((a == b) && (b == c)) {
			System.out.println(10000 + 1000 * a);
		} else if ((a == b) && (b != c)) {
			System.out.println(1000 + 100 * a);
		} else if ((a == c) && (a != b)) {
			System.out.println(1000 + 100 * a);
		} else if ((b == c) && (a != b)) {
			System.out.println(1000 + 100 * b);
		} else if ((a != b) && (b != c)) {
			if ((a > b) && (a > c)) {
				System.out.println(100 * a);
			} else if ((b > a) && (b > c)) {
				System.out.println(100 * b);
			} else if ((c > a) && (c > b)) {
				System.out.println(100 * c);
			}
		}
	}
}