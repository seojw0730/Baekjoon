package class2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class 제로 {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		try {
			int n = Integer.parseInt(br.readLine());
			int[] intArr = new int[n];
			for(int i = 0; i < n; i++) {
				int temp = Integer.parseInt(br.readLine());
				if(temp == 0) {
					int temp2 = i-1;
					while(true) {
						if(intArr[temp2] != 0) {
							intArr[temp2] = 0;
							break;
						}
						temp2--;
					}
				}else {
					intArr[i] = temp;
				}
			}
			br.close();
			int answer = 0;
			for(int i = 0; i < n; i++) {
				answer += intArr[i];
			}
			bw.append(String.valueOf(answer)).close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
