package class2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class 체스판다시칠하기 {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		try {
			String[] strArr = br.readLine().split(" ");
			int row = Integer.parseInt(strArr[0]);
			int col = Integer.parseInt(strArr[1]);
			String[][] chessArr = new String[row][col];
			for (int i = 0; i < row; i++) {
				String line = br.readLine();
				for (int j = 0; j < col; j++) {
					chessArr[i][j] = String.valueOf(line.charAt(j));
				}
			}
			br.close();
			
			int answer = 64;
			for(int a = 0; a < row - 7; a++) {
				for(int b = 0; b < col - 7; b++) {
					int min = 64;
					// B부터 시작
					int case1 = 0;
					for (int i = a; i < a+8; i += 2) {
						for (int j = b; j < b+8; j += 2) {
							if(!chessArr[i][j].equals("B")) {
								case1++;
							}
						}
						for(int j = b+1; j < b+8; j += 2) {
							if(!chessArr[i][j].equals("W")) {
								case1++;
							}
						}
					}
					for (int i = a+1; i < a+8; i += 2) {
						for(int j = b; j < b+8; j += 2) {
							if(!chessArr[i][j].equals("W")) {
								case1++;
							}
						}
						for (int j = b+1; j < b+8; j += 2) {
							if (!chessArr[i][j].equals("B")) {
								case1++;
							}
						}
					}
					// W부터 시작
					int case2 = 0;
					for (int i = a; i < a+8; i += 2) {
						for (int j = b; j < b+8; j += 2) {
							if(!chessArr[i][j].equals("W")) {
								case2++;
							}
						}
						for(int j = b+1; j < b+8; j += 2) {
							if(!chessArr[i][j].equals("B")) {
								case2++;
							}
						}
					}
					for (int i = a+1; i < a+8; i += 2) {
						for(int j = b; j < b+8; j += 2) {
							if(!chessArr[i][j].equals("B")) {
								case2++;
							}
						}
						for (int j = b+1; j < b+8; j += 2) {
							if (!chessArr[i][j].equals("W")) {
								case2++;
							}
						}
					}
					min = Math.min(case1, case2);
					answer = Math.min(answer, min);
				}
			}
			bw.write(String.valueOf(answer));
			bw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}