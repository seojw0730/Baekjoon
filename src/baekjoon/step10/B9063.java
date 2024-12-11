package baekjoon.step10;

import java.io.*;

public class B9063 {
	public static int solution(int[][] arr) {
		int answer = 0;
		if(arr.length == 1) return 0;
		
		int minX = Integer.MAX_VALUE, minY = Integer.MAX_VALUE, maxX = Integer.MIN_VALUE, maxY = Integer.MIN_VALUE;
		for(int i = 0; i < arr.length; i++) {
			minX = Math.min(minX, arr[i][0]);
			minY = Math.min(minY, arr[i][1]);
			maxX = Math.max(maxX, arr[i][0]);
			maxY = Math.max(maxY, arr[i][1]);
		}
		answer = (maxX - minX) * (maxY - minY);
		return answer;
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		int[][] arr = new int[n][2];
		for(int i = 0; i < n; i++) {
			String[] input1 = br.readLine().split(" ");
			for(int j = 0; j < 2; j++) {
				arr[i][j] = Integer.parseInt(input1[j]);
			}
		}
		br.close();
		bw.append(String.valueOf(solution(arr))).close();
	}
}