package baekjoon.step03;

import java.util.*;
import java.io.*;

public class B8393 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		br.close();
		int sum = 0;
		for(int i = 1; i <= n; i++) {
			sum += i;
		}
		bw.append(String.valueOf(sum)).close();
	}
}
