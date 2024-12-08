package baekjoon.step04;

import java.util.*;
import java.io.*;

public class B10810 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] input1 = br.readLine().split(" ");
		int n = Integer.parseInt(input1[0]);
		int m = Integer.parseInt(input1[1]);
		int[] arr = new int[n];
		for(int a = 0; a < m; a++) {
			String[] input2 = br.readLine().split(" ");
			int i = Integer.parseInt(input2[0]);
			int j = Integer.parseInt(input2[1]);
			int k = Integer.parseInt(input2[2]);
			for(int b = i - 1; b < j; b++) {
				arr[b] = k;
			}
		}
		br.close();
		for(int i : arr) bw.append(i + " ");
		bw.close();
	}
}
