package solvedac.class1;

import java.io.*;

public class B1718 {
	public static String solution(String s1, String s2) {
		char[] answer=new char[s1.length()];
		char[] charArr=s1.toCharArray();
		char[] decode=new char[charArr.length];
		for(int i=0; i<decode.length; i++) {
			decode[i]=s2.charAt(i%s2.length());
		}
		int order;
		for(int i=0; i<decode.length; i++) {
			if(charArr[i]==' ') {
				answer[i]=' ';
				continue;
			}
			order=(int)(decode[i]-'a')+1;
			if(charArr[i]-order>='a') answer[i]=(char)(charArr[i]-order);
			else answer[i]=(char)(charArr[i]-order+26);
		}
		StringBuilder sb=new StringBuilder();
		for(char c : answer) sb.append(c);
		return sb.toString();
	}
	
	public static void main(String[] args) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		String s1=br.readLine();
		String s2=br.readLine(); br.close();
		bw.append(solution(s1, s2)).close();
	}
}
