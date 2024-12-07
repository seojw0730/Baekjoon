package baekjoon.step7;

import java.util.*;
import java.io.*;

public class B2566 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int i = Integer.MIN_VALUE, j = Integer.MIN_VALUE, max = Integer.MIN_VALUE;
		for(int a = 0; a < 9; a++) {
			String[] input1 = br.readLine().split(" ");
			for(int b = 0; b < 9; b++) {
				int element = Integer.parseInt(input1[b]);
				if(element > max) {
					i = a + 1; j = b + 1; max = element;
				}
			}
		}
		br.close();
		bw.append(String.valueOf(max));
		bw.newLine();
		bw.append(i + " " + j);
		bw.close();
	}
}
