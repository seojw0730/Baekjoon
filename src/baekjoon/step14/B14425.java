package baekjoon.step14;

import java.util.*;
import java.io.*;

public class B14425 {
	public static int solution(List<String> list, String[] arr2) {
		int answer = 0;
		for(String s2 : arr2) {
			if(list.contains(s2)) {
				answer ++;
			}
		}
		return answer;
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		List<String> list = new ArrayList<>();
		for(int i = 0; i < n; i++) {
			list.add(br.readLine());
		}
		String[] arr = new String[m];
		for(int i = 0; i < m; i++) {
			arr[i] = br.readLine();
		}
		br.close();
		bw.append(String.valueOf(solution(list, arr))).close();
	}
}
