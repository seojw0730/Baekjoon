package baekjoon.step09;

import java.util.*;
import java.io.*;

public class B11653 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		br.close();
		if(n == 1) bw.close();
		else {
			StringBuilder sb = new StringBuilder();
			for(int i = 2; i <= Math.sqrt(n); i++) {
				while(n % i == 0) {
					sb.append(i).append("\n");
					n /= i;
				}
				if(n == 1) break;
			}
			if(n != 1) sb.append(n);
			bw.append(sb).close();
		}
	}
}