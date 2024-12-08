package baekjoon.step03;

import java.util.*;
import java.io.*;

public class B2739 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		br.close();
		for(int i = 1; i <= 9; i++) {
			bw.append(n + " * " + i + " = " + n * i + "\n");
		}
		bw.close();
	}
}
