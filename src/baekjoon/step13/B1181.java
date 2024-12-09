package baekjoon.step13;

import java.util.*;
import java.io.*;

public class B1181 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		String[] arr = new String[N];
		for(int i = 0; i < N; i++) {
			arr[i] = br.readLine();
		}
		br.close();
		
		Arrays.sort(arr, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				if(o1.length() == o2.length()) return o1.compareTo(o2);
				else return o1.length() - o2.length();
			}
		});
		
		StringBuilder sb = new StringBuilder();
		sb.append(arr[0]).append("\n");
		for(int i = 1; i < N; i++) {
			if(!arr[i].equals(arr[i - 1])) {
				sb.append(arr[i]).append("\n");
			}
		}
		bw.append(sb).close();
	}
}
