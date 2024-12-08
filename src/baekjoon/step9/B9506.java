package baekjoon.step9;

import java.util.*;
import java.io.*;

public class B9506 {
	public static String solution(int n) {
		int sum = 0;
		List<Integer> list = new ArrayList<>();
		for(int i = 1; i < n; i++) {
			if(n % i == 0) {
				sum += i;
				list.add(i);
			}
		}
		if(n == sum) {
			StringBuffer sb = new StringBuffer();
			sb.append(n).append(" = ");
			for(int i = 0; i < list.size() - 1; i++) {
				sb.append(list.get(i)).append(" + ");
			}
			sb.append(list.get(list.size() - 1));
			return sb.toString();
		}else {
			return n + " is NOT perfect.";
		}
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		while(true) {
			String input1 = br.readLine();
			if(input1.equals("-1")) break;
			int n = Integer.parseInt(input1);
			bw.append(solution(n));
			bw.newLine();
			bw.flush();
		}
		br.close();
		bw.close();
	}
}