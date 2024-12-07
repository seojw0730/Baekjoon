package baekjoon.step6;

import java.util.*;
import java.io.*;

public class B1316 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		int answer = 0, cnt;
		List<Character> list;
		Set<Character> set;
		for(int i = 0; i < n; i++) {
			String input1 = br.readLine();
			list = new ArrayList<>();
			for(char c : input1.toCharArray()) {
				list.add(c);
			}
			do {
				cnt = 0;
				for(int j = 0; j < list.size() - 1; j++) {
					if(list.get(j) == list.get(j + 1)) {
						list.remove(j);
						cnt++;
						break;
					}
				}
			} while(cnt > 0);
			set = new HashSet<>();
			for(char c : list) {
				set.add(c);
			}
			if(list.size() == set.size()) answer++;
		}
		br.close();
		bw.append(String.valueOf(answer)).close();
	}
}
