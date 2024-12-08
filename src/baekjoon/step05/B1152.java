package baekjoon.step05;

import java.util.*;
import java.io.*;

public class B1152 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String input1 = br.readLine();
		br.close();
		StringTokenizer st = new StringTokenizer(input1, " ");
		bw.append(String.valueOf(st.countTokens())).close();
	}
}
