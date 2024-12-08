package baekjoon.step01;

import java.util.*;
import java.io.*;

public class B18108 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int y = Integer.parseInt(br.readLine());
		br.close();
		bw.append(String.valueOf(y - 543)).close();
	}
}
