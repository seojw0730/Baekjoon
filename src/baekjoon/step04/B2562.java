package baekjoon.step04;

import java.io.*;

public class B2562 {
	public static int[] solution(int[][] arr) {
		int[] answer = new int[2];
		int max = Integer.MIN_VALUE, idx = 0;
		for(int i = 0; i < 9; i++) {
			if(arr[i][0] > max) {
				max = arr[i][0];
				idx = arr[i][1];
			}
		}
		answer[0] = max;
		answer[1] = idx;
		return answer;
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int[][] arr = new int[9][2];
		for(int i = 0; i < 9; i++) {
			arr[i][0] = Integer.parseInt(br.readLine());
			arr[i][1] = i + 1;
		}
		int[] answer = solution(arr);
		for(int i : answer) bw.append(i + "\n");
		bw.close();
	}
}
