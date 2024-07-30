package control;

import java.util.Scanner;

public class Main5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int m = sc.nextInt();
		sc.close();
		if (h > 0) {
			if (m >= 45) {
				System.out.println(h + " " + (m - 45));
			} else {
				System.out.println((h - 1) + " " + (m + 15));
			}
		} else {
			if (m >= 45) {
				System.out.println(h + " " + (m - 45));
			} else {
				System.out.println((23 - h) + " " + (m + 15));
			}
		}
	}
}