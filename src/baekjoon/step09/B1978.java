package baekjoon.step09;

import java.util.*;
import java.io.*;

public class B1978 {
	public static boolean isPrime(int n) {
		if(n == 1) return false;
		if(n == 2) return true;
		
		boolean answer = true;
		for(int i = 2; i < Math.sqrt(n) + 1; i++) {
			if(n % i == 0) {
				answer = false;
				break;
			}
		}
		return answer;
	}
	
	public static int solution(List<Integer> list) {
		int answer = 0;
		for(int i : list) {
			if(isPrime(i)) answer++;
		}
		return answer;
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		String[] input1 = br.readLine().split(" ");
		List<Integer> list = new ArrayList<>();
		for(int i = 0; i < n; i++) {
			list.add(Integer.parseInt(input1[i]));
		}
		bw.append(String.valueOf(solution(list))).close();
	}
}