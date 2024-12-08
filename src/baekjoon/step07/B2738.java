package baekjoon.step07;

import java.util.*;
import java.io.*;

public class B2738 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] input1 = br.readLine().split(" ");
		int n = Integer.parseInt(input1[0]);
		int m = Integer.parseInt(input1[1]);
		int[][] arr = new int[n][m];
		for(int i = 0; i < 2; i++) {
			for(int j = 0; j < n; j++) {
				String[] input2 = br.readLine().split(" ");
				for(int k = 0; k < m; k++) {
					arr[j][k] += Integer.parseInt(input2[k]);
				}
			}
		}
		br.close();
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				bw.append(arr[i][j] + " ");
			}
			bw.newLine();
		}
		bw.close();
	}
}
