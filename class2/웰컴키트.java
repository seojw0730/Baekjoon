package class2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class 웰컴키트 {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		try {
			int num = Integer.parseInt(br.readLine());
			
			String[] sizeArr = br.readLine().split(" ");
			
			String[] shirtpen = br.readLine().split(" ");
			int t = Integer.parseInt(shirtpen[0]);
			int p = Integer.parseInt(shirtpen[1]);
			br.close();
			
			int answerShirt = 0;
			for(int i = 0; i < 6; i++) {
				if(Integer.parseInt(sizeArr[i]) % t == 0) {
					answerShirt += (Integer.parseInt(sizeArr[i]) / t);
				}else {
					answerShirt += (Integer.parseInt(sizeArr[i]) / t) + 1;
				}
			}
			int answerPens = num / p;
			int answerPen = num % p;
			
			bw.append(String.valueOf(answerShirt));
			bw.newLine();
			bw.append(String.valueOf(answerPens) + " " + String.valueOf(answerPen));
			bw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}