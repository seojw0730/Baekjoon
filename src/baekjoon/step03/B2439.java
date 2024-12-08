package baekjoon.step03;

import java.util.*;
import java.io.*;

public class B2439 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		br.close();
		for(int i = 1; i <= n; i++) {
			for(int j = 0; j < n - i; j++) {
				bw.append(" ");
			}
			for(int j = 0; j < i; j++) {
				bw.append("*");
			}
			bw.newLine();
		}
		bw.close();
	}
}
