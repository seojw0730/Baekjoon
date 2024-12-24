package solvedac.class1;

import java.io.*;
import java.util.*;

public class B1434 {
	public static int solution(int[] box, int[] book) {
		int answer=0, tmp;
		for(int i=0; i<book.length; i++){
			tmp=book[i];
			for(int j=0; j<box.length; j++) {
				if(box[j]>=tmp) {
					box[j]-=tmp;
					break;
				}
			}
		}
		for(int i : box) answer+=i;
		return answer;
	}
	
	public static void main(String[] args) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st=new StringTokenizer(br.readLine());
		int n=Integer.parseInt(st.nextToken());
		int m=Integer.parseInt(st.nextToken());
		st=new StringTokenizer(br.readLine());
		int[] box=new int[n];
		for(int i=0; i<n; i++) box[i]=Integer.parseInt(st.nextToken());
		st=new StringTokenizer(br.readLine()); br.close();
		int[] book=new int[m];
		for(int i=0; i<m; i++) book[i]=Integer.parseInt(st.nextToken());
		bw.append(String.valueOf(solution(box, book))).close();
	}
}
