package baekjoon.step19;

import java.io.*;
import java.util.*;

public class B26069 {
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int n=Integer.parseInt(br.readLine());
		Set<String> set=new HashSet<>();
		while(n-- > 0) {
			StringTokenizer st=new StringTokenizer(br.readLine());
			String a=st.nextToken();
			String b=st.nextToken();
			if(a.equals("ChongChong") || b.equals("ChongChong")) {
				set.add(a);
				set.add(b);
			}
			if(set.contains(a) || set.contains(b)) {
				set.add(a);
				set.add(b);
			}
		}
		br.close();
		bw.append(String.valueOf(set.size())).close();
	}
}
