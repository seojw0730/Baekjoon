package baekjoon.step11;

import java.util.*;
import java.io.*;

public class B24264 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		long n = Integer.parseInt(br.readLine());
		br.close();
		bw.append(n * n + "\n2").close();
	}
}