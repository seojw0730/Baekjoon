package twodimension;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[][] arrc = new char[5][15];

		for (int i = 0; i < arrc.length; i++) {
			String word = sc.nextLine();
			for (int j = 0; j < word.length() && j < arrc[i].length; j++) {
				arrc[i][j] = word.charAt(j);
			}
		}
		sc.close();
		for (int j = 0; j < arrc[0].length; j++) {
			for (int i = 0; i < arrc.length; i++) {
				System.out.print(arrc[i][j]);
			}
		}
	}
}