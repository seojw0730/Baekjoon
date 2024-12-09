package baekjoon.step13;

import java.util.*;
import java.io.*;

class Member implements Comparable<Member> {
	int idx, age;
	String name;
	Member(int idx, int age, String name) {
		this.idx = idx;
		this.age = age;
		this.name = name;
	}
	
	@Override
	public int compareTo(Member o) {
		if(this.age == o.age) return this.idx - o.idx;
		else return this.age - o.age;
	}
}

public class B10814 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		List<Member> list = new LinkedList<>();
		StringTokenizer st;
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			list.add(new Member(i, Integer.parseInt(st.nextToken()), st.nextToken()));
		}
		Collections.sort(list);
		StringBuilder sb = new StringBuilder();
		for(Member o : list) {
			sb.append(o.age).append(" ").append(o.name).append("\n");
		}
		bw.append(sb).close();
	}
}
