package baekjoon.step12;

import java.util.*;
import java.io.*;

public class B1018 {
	public static int solution(char[][] arr) {
		int answer = Integer.MAX_VALUE, cnt;
		
		for(int bw = 0; bw < 2; bw++) {
			for(int i = 0; i < arr.length - 7; i++) {
				for(int j = 0; j < arr[0].length - 7; j++) {
					cnt = 0;
					for(int x = i; x < i + 8; x++) {
						for(int y = j; y < j + 8; y++) {
							if((x + y) % 2 == bw) {
								if(arr[x][y] != 'W') cnt++;
							}else {
								if(arr[x][y] != 'B') cnt++;
							}
						}
					}
					answer = Math.min(answer, cnt);
				}
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] input1 = br.readLine().split(" ");
		int n = Integer.parseInt(input1[0]);
		int m = Integer.parseInt(input1[1]);
		char[][] arr = new char[n][m];
		for(int i = 0; i < n; i++) {
			String input2 = br.readLine();
			for(int j = 0; j < m; j++) {
				arr[i][j] = input2.charAt(j);
			}
		}
		br.close();
		bw.append(String.valueOf(solution(arr))).close();
	}
}