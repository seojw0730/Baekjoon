package baekjoon.step10;

import java.util.*;
import java.io.*;

public class B3009 {
	public static int[] solution(int[][] arr) {
		int[] answer = new int[2];
		int[] arrX = new int[3];
		int[] arrY = new int[3];
		for(int i = 0; i < 3; i++) {
			arrX[i] = arr[i][0];
			arrY[i] = arr[i][1];
		}
		Arrays.sort(arrX);
		Arrays.sort(arrY);
		if(arrX[0] == arrX[1]) answer[0] = arrX[2];
		else answer[0] = arrX[0];
		if(arrY[0] == arrY[1]) answer[1] = arrY[2];
		else answer[1] = arrY[0];
		return answer;
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int[][] arr = new int[3][2];
		for(int i = 0; i < 3; i++) {
			String[] input1 = br.readLine().split(" ");
			for(int j = 0; j < 2; j++) {
				arr[i][j] = Integer.parseInt(input1[j]);
			}
		}
		br.close();
		int[] answer = solution(arr);
		StringBuilder sb = new StringBuilder();
		sb.append(answer[0]).append(" ").append(answer[1]);
		bw.append(sb).close();
	}
}