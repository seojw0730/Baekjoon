package class1;

import java.util.Scanner;

public class 직사각형 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String astr = sc.nextLine();
		int a = Integer.parseInt(astr);
		String bstr = sc.nextLine();
		sc.close();
		int b = Integer.parseInt(bstr);
		System.out.println(a*b);
	}
}