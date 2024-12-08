package baekjoon.step11;

import java.util.*;
import java.io.*;

public class B24267 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		long n = Integer.parseInt(br.readLine());
		br.close();
		long answer = 0;
		for(long i = n; i >= 3; i--) {
			answer += (i - 1) * (i - 2) / 2;
		}
		bw.append(answer + "\n3").close();
	}
}