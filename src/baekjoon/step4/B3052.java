package baekjoon.step4;

import java.util.*;
import java.io.*;

public class B3052 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Set<Integer> set = new HashSet<>();
		for(int i = 0; i < 10; i++) {
			set.add(Integer.parseInt(br.readLine()) % 42);
		}
		br.close();
		bw.append(String.valueOf(set.size())).close();
	}
}
