package baekjoon.step14;

import java.util.*;
import java.io.*;

public class B10816 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		Map<String, Integer> map = new HashMap<>();
		String temp;
		for(int i = 0; i < n; i++) {
			temp = st.nextToken();
			map.put(temp, map.getOrDefault(temp, 0) + 1);
		}
		int m = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine(), " ");
		br.close();
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < m; i++) {
			temp = st.nextToken();
			if(map.containsKey(temp)) {
				sb.append(map.get(temp)).append(" ");
			}else {
				sb.append("0 ");
			}
		}
		bw.append(sb).close();
	}
}
