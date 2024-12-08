package baekjoon.step08;

import java.util.*;
import java.io.*;

public class B2720 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int t = Integer.parseInt(br.readLine());
		int[] coins = {25, 10, 5, 1};
		for(int i = 0; i < t; i++) {
			int c = Integer.parseInt(br.readLine());
			for(int j = 0; j < 4; j++) {
				bw.append(String.valueOf(c / coins[j]) + " ");
				c %= coins[j];
			}
			bw.newLine();
		}
		br.close();
		bw.close();
	}
}