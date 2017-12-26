package operations;

import java.util.Scanner;

public class op_2839_01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int kilo = scan.nextInt();
		int totcnt=0;
		int min=9999;

		if(kilo % 5 == 0){
			totcnt = kilo/5;
			min = totcnt;
		}else{
			for(int x=1; x<=kilo/5 ; x++){
				for(int y=1; y<=kilo/3; y++){
					if(kilo == (5*x + 3*y)){
						totcnt = x+y;
					}
				}
				if(totcnt>0 && totcnt <= min)   min = totcnt;
			}
		}
		if(min==9999)    min=-1;
		sb.append(min+"\n");
		System.out.println(sb.toString());
	}

}
