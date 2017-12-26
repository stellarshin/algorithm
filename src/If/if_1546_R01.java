package If;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class if_1546_R01 {
	
	static int MAX_N = 1001;
	static int N;
	static double MAX;
	static int SUM;
	static int[] SCORE = new int[MAX_N];

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(in.readLine());
		
		StringTokenizer st = new StringTokenizer(in.readLine());
		
		for(int idx =0; idx<N; idx++){
			SCORE[idx] = Integer.parseInt(st.nextToken());
			SUM +=SCORE[idx];
			MAX = Math.max(MAX, SCORE[idx]);
		}
		
		System.out.printf("%.2f\n", (SUM * 100 / MAX / N));

	}

}

