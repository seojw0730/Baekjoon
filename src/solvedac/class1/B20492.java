package solvedac.class1;

import java.io.*;

public class B20492 {
	public static double[] solution(int n) {
		double[] answer=new double[2];
		answer[0]=0.78*n;
		answer[1]=0.8*n+0.78*0.2*n;
		return answer;
	}
	
	public static void main(String[] args) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int n=Integer.parseInt(br.readLine()); br.close();
		double[] answer=solution(n);
		for(double d : answer) bw.append((int)d+" ");
		bw.close();
	}
}
