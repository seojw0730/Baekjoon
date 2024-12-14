package baekjoon.step19;

import java.io.*;
import java.util.*;

public class B25192 {
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int n=Integer.parseInt(br.readLine()), answer=0;
		Set<String> set=new HashSet<>();
		while(n-- > 0) {
			String temp=br.readLine();
			if(temp.equals("ENTER")) {
				answer+=set.size();
				set=new HashSet<>();
			}else {
				set.add(temp);
			}
		}
		answer+=set.size();
		bw.append(String.valueOf(answer)).close();
	}
}
