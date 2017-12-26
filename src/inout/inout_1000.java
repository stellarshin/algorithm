package inout;

import java.util.Scanner;

public class inout_1000 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int cnt = 2;
		int rlt = 0;
		while(cnt>0){
			int n = sc.nextInt();
			rlt+=n;
			cnt--;
		}
		System.out.println(rlt);
	}

}
