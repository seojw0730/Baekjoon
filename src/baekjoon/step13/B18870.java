package baekjoon.step13;

import java.util.*;
import java.io.*;

public class B18870 {
	public static int[] solution(int N, long[] arr) {
		int[] answer = new int[N];
		long[] temp = arr.clone();
		Arrays.sort(temp);
		Map<Long, Integer> map = new HashMap<>();
		int rank = 0;
		for(long l : temp) {
			if(!map.containsKey(l)) {
				map.put(l, rank++);
			}
		}
		for(int i = 0; i < N; i++) {
			answer[i] = map.get(arr[i]);
		}
		return answer;
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		long[] arr = new long[N];
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		br.close();
		for(int i = 0; i < N; i++) {
			arr[i] = Long.parseLong(st.nextToken());
		}
		int[] answer = solution(N, arr);
		StringBuilder sb = new StringBuilder();
		for(int i : answer) {
			sb.append(i).append(" ");
		}
		bw.append(sb).close();
	}
}
