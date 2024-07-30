package loop;

import java.util.Scanner;

public class Main12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			String s = sc.nextLine();
			if (s == null) {
				sc.close();
				break;
			}
			String[] arrStr = s.split(" ");
			int a = Integer.parseInt(arrStr[0]);
			int b = Integer.parseInt(arrStr[1]);
			System.out.println(a + b);
		}
	}
}