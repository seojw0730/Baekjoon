package baekjoon.step13;

import java.util.*;
import java.io.*;

public class B2751 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		for(int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		Arrays.sort(arr);
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < N - 1; i++) {
			sb.append(arr[i]).append("\n");
		}
		sb.append(arr[N - 1]);
		bw.append(sb).close();
	}
}
