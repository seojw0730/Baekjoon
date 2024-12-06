package baekjoon.step5;

import java.util.*;
import java.io.*;

public class B27866 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String input1 = br.readLine();
		int i = Integer.parseInt(br.readLine());
		br.close();
		bw.append(input1.charAt(i - 1)).close();
	}
}
