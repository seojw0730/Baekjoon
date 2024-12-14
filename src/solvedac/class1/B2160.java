package solvedac.class1;

import java.io.*;

public class B2160 {
	public static int[] solution(int n, char[][] arr) {
		int[] answer=new int[2];
		int min=Integer.MAX_VALUE;
		for(int a=0; a<n-1; a++) {
			for(int b=a+1; b<n; b++) {
				int cnt=0;
				for(int i=0; i<5; i++) {
					for(int j=0; j<7; j++) {
						if(arr[5*a+i][j]!=arr[5*b+i][j]) cnt++;
					}
				}
				if(cnt<min) {
					min=cnt;
					answer[0]=a+1;
					answer[1]=b+1;
				}
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int n=Integer.parseInt(br.readLine());
		char[][] arr=new char[5*n][7];
		for(int i=0; i<5*n; i++) {
			String temp=br.readLine();
			for(int j=0; j<7; j++) {
				arr[i][j]=temp.charAt(j);
			}
		}
		int[] answer=solution(n, arr);
		bw.append(answer[0]+" "+answer[1]).close();
	}
}