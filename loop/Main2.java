package loop;

import java.util.Scanner;

public class Main2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ite = sc.nextInt();
		int[] arr = new int[ite];
		int a, b;
		for (int i = 0; i < ite; i++) {
			a = sc.nextInt();
			b = sc.nextInt();
			arr[i] = a + b;
			System.out.println(arr[i]);
		}
		sc.close();
	}
}