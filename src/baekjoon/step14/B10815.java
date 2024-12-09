package baekjoon.step14;

import java.util.*;
import java.io.*;

public class B10815 {
	public static int[] solution(int n, int[] arr1, int m, int[] arr2) {
		int[] answer = new int[m];
		Map<Integer, Integer> map = new HashMap<>();
		for(int i : arr2) {
			map.put(i, 0);
		}
		for(int i : arr1) {
			map.put(i, map.getOrDefault(i, 0) + 1);
		}
		for(int i = 0; i < m; i++) {
			answer[i] = map.get(arr2[i]);
		}
		return answer;
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		int[] arr1 = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for(int i = 0; i < n; i++) {
			arr1[i] = Integer.parseInt(st.nextToken());
		}
		int m = Integer.parseInt(br.readLine());
		int[] arr2 = new int[m];
		st = new StringTokenizer(br.readLine(), " ");
		for(int i = 0; i < m; i++) {
			arr2[i] = Integer.parseInt(st.nextToken());
		}
		int[] answer = solution(n, arr1, m, arr2);
		StringBuilder sb = new StringBuilder();
		for(int i : answer) {
			sb.append(i).append(" ");
		}
		bw.append(sb).close();
	}
}
