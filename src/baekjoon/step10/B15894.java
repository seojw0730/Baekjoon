package baekjoon.step10;

import java.util.*;
import java.io.*;

public class B15894 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		long n = Long.parseLong(br.readLine());
		br.close();
		bw.append(String.valueOf(4 * n)).close();
	}
}