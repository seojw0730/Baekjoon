package baekjoon.step13;

import java.util.*;
import java.io.*;

public class B1427 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String input1 = br.readLine();
		br.close();
		List<Integer> list = new LinkedList<>();
		for(int i = 0; i < input1.length(); i++) {
			list.add(Integer.parseInt(String.valueOf(input1.charAt(i))));
		}
		Collections.sort(list, Collections.reverseOrder());
		StringBuilder sb = new StringBuilder();
		for(int i : list) {
			sb.append(i);
		}
		bw.append(sb).close();
	}
}
