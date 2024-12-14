package baekjoon.step19;

import java.io.*;
import java.util.*;
import java.util.Map.Entry;

public class B20920 {
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st=new StringTokenizer(br.readLine());
		int n=Integer.parseInt(st.nextToken());
		int m=Integer.parseInt(st.nextToken());
		Map<String, Integer> map=new HashMap<>();
		while(n-- > 0) {
			String word=br.readLine();
			if(word.length()>=m) map.put(word, map.getOrDefault(word, 0)+1);
		}
		List<Map.Entry<String, Integer>> entryList=new LinkedList<>(map.entrySet());
		entryList.sort(new Comparator<Map.Entry<String, Integer>>(){
			@Override
			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
				if(o1.getValue()==o2.getValue()) {
					if(o1.getKey().length()==o2.getKey().length()) {
						return o1.getKey().compareTo(o2.getKey());
					}
					return o2.getKey().length()-o1.getKey().length();
				}
				return o2.getValue()-o1.getValue();
			}
		});
		StringBuilder sb=new StringBuilder();
		for(Map.Entry<String, Integer> entry : entryList) {
			sb.append(entry.getKey()).append("\n");
		}
		bw.append(sb).close();
	}
}
