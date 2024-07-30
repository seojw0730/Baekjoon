package array;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main2 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		// 첫째줄
		String nx = br.readLine();
		
		// n, x에 값 저장
		st = new StringTokenizer(nx);
		int n = Integer.parseInt(st.nextToken());
		int x = Integer.parseInt(st.nextToken());
		
		// 둘째줄
		String arr = br.readLine();
		st = new StringTokenizer(arr);

		// 둘째줄 숫자들 배열에 저장
		int[] arrInt = new int[n];
		for (int i = 0; i < arrInt.length; i++) {
			arrInt[i] = Integer.parseInt(st.nextToken());
		}
		
		// x보다 작은 값들 출력
		for (int i = 0; i < arrInt.length; i++) {
			if (arrInt[i] < x) {
				bw.append(arrInt[i] + " ");
			}
		}
		bw.close();
	}
}