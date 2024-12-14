package solvedac.class1;

import java.io.*;
import java.util.*;

public class B26040 {
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		String a=br.readLine();
		StringTokenizer st=new StringTokenizer(br.readLine());
		int n=st.countTokens();
		for(int i=0; i<n; i++) {
			String temp=st.nextToken();
			a=a.replace(temp, temp.toLowerCase());
		}
		bw.append(a).close();
	}
}