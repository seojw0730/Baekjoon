package baekjoon.step05;

import java.util.*;
import java.io.*;

public class B11718 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		while(true) {
			String input1 = br.readLine();
			if(input1 == null) break;
			bw.append(input1);
			bw.newLine();
		}
		br.close();
		bw.close();
	}
}
