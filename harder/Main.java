package harder;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String inputStr = sc.nextLine();
		int input = Integer.parseInt(inputStr);
		
		for(int i = 0; i < input; i++) {
			for(int j = 0; j < input-i-1; j++) {
				System.out.print(" ");
			}
			for(int j = 0; j < 2*(i+1)-1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i = 0; i < input-1; i++) {
			for(int j = 0; j < i+1; j++) {
				System.out.print(" ");
			}
			for(int j = 0; j < 2*(input-i-1)-1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		sc.close();
	}
}