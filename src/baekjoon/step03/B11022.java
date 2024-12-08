package baekjoon.step03;

import java.util.*;
import java.io.*;

public class B11022 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int t = Integer.parseInt(br.readLine());
		for(int i = 1; i <= t; i++) {
			String[] input = br.readLine().split(" ");
			int a = Integer.parseInt(input[0]);
			int b = Integer.parseInt(input[1]);
			bw.append("Case #" + i + ": " + a + " + " + b + " = " + (a + b) + "\n");
		}
		br.close();
		bw.close();
	}
}
