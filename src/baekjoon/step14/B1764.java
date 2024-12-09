package baekjoon.step14;

import java.util.*;
import java.io.*;

public class B1764 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		Map<String, Integer> map = new HashMap<>();
		for(int i = 0; i < n; i++) {
			map.put(br.readLine(), 1);
		}
		String temp;
		for(int i = 0; i < m; i++) {
			temp = br.readLine();
			map.put(temp, map.getOrDefault(temp, 0) + 1);
		}
		List<String> list = new LinkedList<>();
		for(Map.Entry<String, Integer> entry : map.entrySet()) {
			if(entry.getValue() == 2) {
				list.add(entry.getKey());
			}
		}
		Collections.sort(list);
		StringBuilder sb = new StringBuilder();
		sb.append(list.size()).append("\n");
		for(String s : list) {
			sb.append(s).append("\n");
		}
		bw.append(sb).close();
	}
}
