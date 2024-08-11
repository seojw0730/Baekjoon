package class1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class tenfactorial {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		try {
			long n = Long.parseLong(br.readLine());
			br.close();
			
			long factorial = factorial(n);
			long answer = factorial / (factorial(10)/6);
			
			bw.append(String.valueOf(answer)).close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static long factorial(long l) {
		if(l == 1) {
			return 1;
		}else {
			return l * factorial(l-1);
		}
	}
}
