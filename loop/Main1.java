package loop;

import java.util.Scanner;

public class Main1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int dan = sc.nextInt();
		sc.close();
		for (int i = 0; i < 9; i++) {
			System.out.println(dan + " * " + (i + 1) + " = " + (dan * (i + 1)));
		}
	}
}