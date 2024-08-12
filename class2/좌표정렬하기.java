package class2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class 좌표정렬하기 {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		try {
			int n = Integer.parseInt(br.readLine());
			int[][] intArr = new int[n][2];
			for(int i = 0; i < n; i++) {
				String[] xy = br.readLine().split(" ");
				intArr[i][0] = Integer.parseInt(xy[0]);
				intArr[i][1] = Integer.parseInt(xy[1]);
			}
			br.close();
			
			for(int i = 0; i < n - 1; i++) {
				for(int j = 0; j < n - 1 - i; j++) {
					if(intArr[j][0] > intArr[j+1][0]) {
						int[] temp = intArr[j];
						intArr[j] = intArr[j+1];
						intArr[j+1] = temp;
					}else if(intArr[j][0] == intArr[j+1][0]) {
						if(intArr[j][1] > intArr[j+1][1]) {
							int[] temp = intArr[j];
							intArr[j] = intArr[j+1];
							intArr[j+1] = temp;
						}
					}
				}
			}
			
			for(int i = 0; i < n; i++) {
				if(i < n) {
					bw.append(String.valueOf(intArr[i][0]) + " " + String.valueOf(intArr[i][1]) + "\n");
				}else {
					bw.append(String.valueOf(intArr[i][0]) + " " + String.valueOf(intArr[i][1]));
				}
			}
			bw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}