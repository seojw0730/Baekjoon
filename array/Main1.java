package array;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main1 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		// 첫째줄
		int n = Integer.parseInt(br.readLine());
		// 둘째줄
		String s = br.readLine();
		// 셋째줄
		int v = Integer.parseInt(br.readLine());

		// 공백 없애서 토큰으로 나누기
		st = new StringTokenizer(s);

		// 각 토큰 정수 배열에 대입
		int[] arrInt = new int[n];

		for (int i = 0; i < arrInt.length; i++) {
			arrInt[i] = Integer.parseInt(st.nextToken());
		}

		// 출력할 변수 초기화
		int count = 0;

		// 정수 배열에서 v와 같은 숫자 개수 세기
		for (int i = 0; i < arrInt.length; i++) {
			if (arrInt[i] == v) {
				count++;
			}
		}
		bw.write(count + "\n");
		bw.flush();
		bw.close();
	}
}