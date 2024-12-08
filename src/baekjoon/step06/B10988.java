package baekjoon.step06;

import java.util.*;
import java.io.*;

public class B10988 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String input1 = br.readLine();
		br.close();
		StringBuffer sb = new StringBuffer(input1).reverse();
		if(input1.equals(sb.toString())) bw.append("1");
		else bw.append("0");
		bw.close();
	}
}
