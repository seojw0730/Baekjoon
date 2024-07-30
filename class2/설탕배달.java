package class2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class 설탕배달 {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			String weightStr = br.readLine();
			br.close();
			
			int weight = Integer.parseInt(weightStr); // 설탕 무게
			int answer = 0; // 가방 수
			
			while(true) {
				// 무게가 5의 배수면
				if(weight % 5 == 0) {
					answer += weight / 5;
					bw.append(String.valueOf(answer));
					bw.close();
					break;
				}
				// 무게가 5의 배수가 아니면
				else {
					weight -= 3;
					answer += 1;
				}
				
				// 무게가 결국 음수가 됐다면
				if(weight < 0) {
					bw.append(String.valueOf(-1));
					bw.close();
					break;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}