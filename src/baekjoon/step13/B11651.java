package baekjoon.step13;

import java.util.*;
import java.io.*;

public class B11651 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		int[][] arr = new int[N][2];
		String[] input1;
		for(int i = 0; i < N; i++) {
			input1 = br.readLine().split(" ");
			arr[i][0] = Integer.parseInt(input1[0]);
			arr[i][1] = Integer.parseInt(input1[1]);
		}
		
		Arrays.sort(arr, (e1, e2) -> {
			if(e1[1] == e2[1]) return e1[0] - e2[0];
			else return e1[1] - e2[1];
		});
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < N; i++) {
			sb.append(arr[i][0]).append(" ").append(arr[i][1]).append("\n");
		}
		bw.append(sb).close();
	}
}
