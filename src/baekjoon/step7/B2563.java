package baekjoon.step7;

import java.util.*;
import java.io.*;

public class B2563 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int[][] arr = new int[101][101];
		int n = Integer.parseInt(br.readLine());
		for(int i = 0; i < n; i++) {
			String[] input1 = br.readLine().split(" ");
			int x = Integer.parseInt(input1[0]);
			int y = Integer.parseInt(input1[1]);
			for(int j = x; j < x + 10; j++) {
				for(int k = y; k < y + 10; k++) {
					arr[j][k] = 1;
				}
			}
		}
		br.close();
		int answer = 0;
		for(int i = 1; i <= 100; i++) {
			for(int j = 1; j <= 100; j++) {
				if(arr[i][j] == 1) answer++; 
			}
		}
		bw.append(String.valueOf(answer)).close();
	}
}