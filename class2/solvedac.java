package class2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class solvedac {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		try {
			int n = Integer.parseInt(br.readLine());
			int cut = (int) Math.round((double)n * 0.15);
			List<Integer> list = new LinkedList<>();
			for(int i = 0; i < n; i++) {
				list.add(Integer.parseInt(br.readLine()));
			}
			br.close();
			
			Collections.sort(list);
			
			for(int i = 0; i < cut; i++) {
				list.remove(0);
				list.remove(list.size() - 1);
			}
			
			int answer = 0;
			for(int i = 0; i < list.size(); i++) {
				answer += list.get(i);
			}
			answer = (int)Math.round((double)answer / (n - (2 * cut)));
			bw.append(String.valueOf(answer)).close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
