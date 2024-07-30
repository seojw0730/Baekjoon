package loop;

import java.util.Scanner;

public class Main5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String numStr = sc.nextLine();
		sc.close();
		int num = Integer.parseInt(numStr);
		int div = num / 4;
		for(int i = 0; i < div; i++) {
			System.out.print("long ");
		}
		System.out.print("int");
	}
}