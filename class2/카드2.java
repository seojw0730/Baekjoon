package class2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.List;

public class 카드2 {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		try {
			int size = Integer.parseInt(br.readLine());
			br.close();
			
			if(size == 1) {
				bw.append("1").close();
				return;
			}
			
			List<Integer> list = new LinkedList<>();
			for(int i=0; i<size; i++) {
				list.add(i+1);
			}
			
			while(true) {
				list.remove(0);
				if(list.size() == 1) {
					break;
				}
				
				int remove = list.remove(0);
				list.add(remove);
				if(list.size() == 1) {
					break;
				}
			}
			
			bw.append(String.valueOf(list.get(0))).close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
