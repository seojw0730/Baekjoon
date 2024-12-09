package baekjoon.step14;

import java.util.*;
import java.io.*;

public class B1269 {
	public static int solution(int n1, int[] arr1, int n2, int[] arr2) {
		Map<Integer, Integer> map = new HashMap<>();
		for(int i : arr1) {
			map.put(i, 1);
		}
		for(int i : arr2) {
			map.put(i, map.getOrDefault(i, 0) + 1);
		}
		List<Integer> list = new ArrayList<>();
		for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
			if(entry.getValue() == 2) {
				list.add(entry.getKey());
			}
		}
		return arr1.length + arr2.length - 2 * list.size();
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int input1 = Integer.parseInt(st.nextToken());
		int[] arr1 = new int[input1];
		int input2 = Integer.parseInt(st.nextToken());
		int[] arr2 = new int[input2];
		st = new StringTokenizer(br.readLine(), " ");
		for(int i = 0; i < input1; i++) {
			arr1[i] = Integer.parseInt(st.nextToken());
		}
		st = new StringTokenizer(br.readLine(), " "); br.close();
		for(int i = 0; i < input2; i++) {
			arr2[i] = Integer.parseInt(st.nextToken());
		}
		bw.append(String.valueOf(solution(input1, arr1, input2, arr2))).close();
	}
}
