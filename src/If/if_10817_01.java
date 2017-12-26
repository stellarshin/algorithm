package If;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class if_10817_01 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer str = new StringTokenizer(br.readLine());
		
		ArrayList<Integer> list = new ArrayList<>();
		
		list.add(Integer.parseInt(str.nextToken()));
		list.add(Integer.parseInt(str.nextToken()));
		list.add(Integer.parseInt(str.nextToken()));
		
		Collections.sort(list);
		
		System.out.println(list.get(1));
			

	}

}
