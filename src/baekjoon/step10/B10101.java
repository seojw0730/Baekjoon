package baekjoon.step10;

import java.io.*;

public class B10101 {
	public static String solution(int[] arr) {
		int sum = 0;
		for(int i : arr) {
			sum += i;
		}
		if(sum == 180) {
			if(arr[0] == 60 && arr[1] == 60) {
				return "Equilateral";
			}else if((arr[0] == arr[1]) || (arr[1] == arr[2]) || (arr[2] == arr[0])) {
				return "Isosceles";
			}else {
				return "Scalene";
			}
		}else {
			return "Error";
		}
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int[] arr = new int[3];
		for(int i = 0; i < 3; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		br.close();
		bw.append(solution(arr)).close();
	}
}