package baekjoon.step15;

import java.io.*;

public class B17103 {
	public static int solution(int n, boolean[] arr) {
		int answer = 0;
		for(int i = 2; i <= n / 2; i++) {
			if(!arr[i] && !arr[n - i]) answer++;
		}
		return answer;
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int t = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		boolean[] arr = new boolean[1000001];
		arr[0] = arr[1] = true;
		for(int i = 2; i < 1000000; i++) {
			if(!arr[i]) {
				for(int j = 2 * i; j <1000000; j += i) {
					arr[j] = true;
				}
			}
		}
		while(t-- > 0) {
			sb.append(solution(Integer.parseInt(br.readLine()), arr)).append("\n");
		}
		br.close();
		bw.append(sb).close();
	}
}
