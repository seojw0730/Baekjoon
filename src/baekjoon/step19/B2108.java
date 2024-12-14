package baekjoon.step19;

import java.io.*;

public class B2108 {
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int n=Integer.parseInt(br.readLine());
		double sum=0;
		int max=Integer.MIN_VALUE;
		int min=Integer.MAX_VALUE;
		int mid=Integer.MIN_VALUE;
		int[] arr=new int[8001];
		for(int i=0; i<n; i++) {
			int input=Integer.parseInt(br.readLine());
			sum+=input;
			if(input>max) max=input;
			if(input<min) min=input;
			arr[input+4000]++;
		}
		int midCnt=0;
		int freq=0, freqCnt=0;
		boolean isFreq=false;
		for(int i=min+4000; i<=max+4000; i++) {
			int temp=arr[i];
			if(temp>0) {
				if(midCnt<(n+1)/2) {
					mid=i-4000;
					midCnt+=temp;
				}
				if(temp>freqCnt) {
					freqCnt=temp;
					freq=i-4000;
					isFreq=true;
				}else if(temp==freqCnt && isFreq) {
					freq=i-4000;
					isFreq=false;
				}
			}
		}
		StringBuilder sb=new StringBuilder();
		sb.append((int)Math.round(sum/n)).append("\n");
		sb.append(mid).append("\n");
		sb.append(freq).append("\n");
		sb.append(max-min);
		bw.append(sb).close();
	}
}
