package class2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class 수정렬하기3 {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			int len = Integer.parseInt(br.readLine());
			
			int[] intArr = new int[len];
			for(int i = 0; i < len; i++) {
				intArr[i] = Integer.parseInt(br.readLine());
			}
			br.close();
			
			sort(intArr);
			
			for(int i = 0; i < len; i++) {
				bw.append(String.valueOf(intArr[i]) + "\n");
			}
			bw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void sort(int[] intArr) {
		for(int i = 0; i < intArr.length - 1; i++) {
			for(int j = 0; j < intArr.length - 1 - i; j++) {
				if(intArr[j] > intArr[j+1]) {
					int temp = intArr[j];
					intArr[j] = intArr[j+1];
					intArr[j+1] = temp;
				}
			}
		}
	}
}