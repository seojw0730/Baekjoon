package baekjoon.step14;

import java.util.*;
import java.io.*;

public class B7785 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		Map<String, String> map = new HashMap<String, String>();
		String[] input1;
		String name, state;
		for(int i = 0; i < n; i++) {
			input1 = br.readLine().split(" ");
			name = input1[0];
			state = input1[1];
			if(map.containsKey(name)) {
				map.remove(name);
			}else {
				map.put(name, state);
			}
		}
		List<String> list = new LinkedList<>();
		for(String s : map.keySet()) {
			list.add(s);
		}
		Collections.sort(list, Collections.reverseOrder());
		StringBuilder sb = new StringBuilder();
		for(String s : list) {
			sb.append(s).append("\n");
		}
		bw.append(sb).close();
	}
}
