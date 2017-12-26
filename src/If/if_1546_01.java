package If;

import java.util.Scanner;

public class if_1546_01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int cnt = Integer.parseInt(sc.next());
		double[] scores = new double[cnt];
		double[] rlt = new double[cnt];
		double sum = 0;
		
		for(int i=0; i<scores.length; i++){
			scores[i] = sc.nextDouble();
		}
		
		double MAX = scores[0];
		
		for(int i=0; i<scores.length; i++){
			if(scores[i] > MAX) MAX = scores[i];
		}
		
		for(int i=0; i<scores.length; i++){
			rlt[i] = (double)scores[i]/MAX*100;
			sum += rlt[i];
		}
		
		System.out.printf("%.2f", sum/cnt);

	}

}
