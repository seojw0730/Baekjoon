package baekjoon.step4;

import java.util.*;
import java.io.*;

public class B5597 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int[] arr = new int[31];
		for(int i = 0; i < 28; i++) {
			int n = Integer.parseInt(br.readLine());
			arr[n] = 1;
		}
		br.close();
		for(int i = 1; i <= 30; i++) {
			if(arr[i] != 1) bw.append(String.valueOf(i) + "\n");
		}
		bw.close();
	}
}
