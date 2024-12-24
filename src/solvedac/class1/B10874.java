package solvedac.class1;

import java.io.*;
import java.util.*;

public class B10874 {
	public static void main(String[] args) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int n=Integer.parseInt(br.readLine());
		List<Integer> answer=new ArrayList<>();
		StringTokenizer st;
		int[] tmp;
		int score;
		for(int i=0; i<n; i++) {
			score=0;
			tmp=new int[10];
			st=new StringTokenizer(br.readLine());
			for(int j=0; j<10; j++) {
				tmp[j]=Integer.parseInt(st.nextToken());
			}
			for(int j=0; j<10; j++) {
				if(tmp[j]==j%5+1) score++;
			}
			if(score==10) answer.add(i+1); 
		}
		StringBuilder sb=new StringBuilder();
		for(int i : answer) sb.append(i).append("\n");
		bw.append(sb).close();
	}
}
