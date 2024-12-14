package solvedac.class1;

import java.io.*;
import java.util.*;

public class B15964 {
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st=new StringTokenizer(br.readLine()); br.close();
		long a=Long.parseLong(st.nextToken());
		long b=Long.parseLong(st.nextToken());
		bw.append(String.valueOf((a+b)*(a-b))).close();
	}
}
