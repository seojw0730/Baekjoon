package baekjoon.step14;

import java.util.*;
import java.io.*;

public class B1620 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		Map<String, String> map1 = new HashMap<>();
		Map<String, String> map2 = new HashMap<>();
		String name;
		for(int i = 0; i< n; i++) {
			name = br.readLine();
			map1.put(String.valueOf(i + 1), name);
			map2.put(name, String.valueOf(i + 1));
		}
		StringBuilder sb = new StringBuilder();
		String temp;
		for(int i = 0; i < m; i++) {
			temp = br.readLine();
			if(Character.isDigit(temp.charAt(0))) {
				sb.append(map1.get(temp));
			}else {
				sb.append(map2.get(temp));
			}
			sb.append("\n");
		}
		br.close();
		bw.append(sb).close();
	}
}
