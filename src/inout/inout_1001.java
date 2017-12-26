package inout;

import java.util.Scanner;

public class inout_1001 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		if(0<n && m<10){			
			System.out.println(n-m);
		}
		sc.close();
	}

}
