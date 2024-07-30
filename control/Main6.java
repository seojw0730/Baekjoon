package control;

import java.util.Scanner;

public class Main6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int m = sc.nextInt();
		int time = sc.nextInt();
		sc.close();
		int m2 = m + time;
		if (m2 > 59) {
			if ((h + m2 / 60) > 23) {
				System.out.println((h + m2 / 60 - 24) + " " + (m2 - 60 * (m2 / 60)));
			} else {
				System.out.println((h + m2 / 60) + " " + (m2 - 60 * (m2 / 60)));
			}
		} else {
			System.out.println(h + " " + m2);
		}
	}
}