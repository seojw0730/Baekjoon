package solvedac.class1;

import java.util.*;
import java.io.*;

public class B2605 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for(int i = 0; i < n; i++) arr[i] = Integer.parseInt(st.nextToken());
		List<Integer> list = new ArrayList<>();
		for(int i = 1; i <= n; i++) list.add(list.size() - arr[i - 1], i);
		StringBuilder sb = new StringBuilder();
		for(int i : list) sb.append(i).append(" ");
		bw.append(sb).close();
	}
}
