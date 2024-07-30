package string;

import java.util.Scanner;

public class Main1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String string = sc.nextLine();
		String idxStr = sc.nextLine();
		sc.close();
		int idx = Integer.parseInt(idxStr);
		char result = string.charAt(idx-1);
		System.out.println(result);
	}
}