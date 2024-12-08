package baekjoon.step03;

import java.util.*;
import java.io.*;

public class B25314 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		br.close();
		for(int i = 0; i < n / 4; i++) {
			bw.append("long ");
		}
		bw.append("int").close();
	}
}
