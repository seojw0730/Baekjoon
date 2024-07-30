package class2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class 소수찾기 {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			// 주어지는 정수 개수
			String numStr = br.readLine();
			int num = Integer.parseInt(numStr);
			
			// 주어지는 정수 배열
			String[] primeStrArr = br.readLine().split(" ");
			br.close();
			int[] primeArr = new int[primeStrArr.length];
			for(int i = 0; i < primeArr.length; i++) {
				primeArr[i] = Integer.parseInt(primeStrArr[i]);
			}
			
			int count = 0; // 소수 개수
			int isPrime = 0; // 소수 판별 인자
			for(int i = 0; i < num; i++) {
				isPrime = 0;
				for(int j = 2; j < primeArr[i]+1; j++) {
					if(primeArr[i] % j == 0) {
						isPrime++;
					}
				}
				// 1 이외의 약수가 자기자신뿐이라면
				if(isPrime == 1) {
					count++;
				}
			}
			bw.append(String.valueOf(count));
			bw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}