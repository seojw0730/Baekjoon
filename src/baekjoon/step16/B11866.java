package baekjoon.step16;

import java.io.*;
import java.util.*;

public class B11866 {
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st=new StringTokenizer(br.readLine(), " "); br.close();
		int n=Integer.parseInt(st.nextToken());
		int k=Integer.parseInt(st.nextToken());
		Queue<Integer> queue=new LinkedList<>();
		for(int i=1; i<=n; i++) queue.offer(i);
		int cnt=1;
		List<Integer> list=new ArrayList<>();
		while(!queue.isEmpty()) {
			if(cnt==k) {
				list.add(queue.poll());
				cnt=0;
			}else queue.offer(queue.poll());
			cnt++;
		}
		StringBuilder sb=new StringBuilder();
		sb.append("<");
		for(int i=0; i<list.size(); i++) {
			sb.append(list.get(i));
			if(i<list.size()-1) sb.append(", ");
		}
		sb.append(">");
		bw.append(sb).close();
	}
}
