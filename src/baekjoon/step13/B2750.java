package baekjoon.step13;

import java.util.*;
import java.io.*;

public class B2750 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		br.close();
		Arrays.sort(arr);
		StringBuilder sb = new StringBuilder();
		for(int i : arr) {
			sb.append(i).append("\n");
		}
		bw.append(sb).close();
	}
}