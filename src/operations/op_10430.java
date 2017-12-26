package operations;

import java.util.Scanner;

public class op_10430 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);	
		int[] i = new int[3];
		int A,B,C;
		for(int n=0; n<i.length; n++){
			i[n] = sc.nextInt();
		}
		
		A = i[0];
		B = i[1];
		C = i[2];
		
		System.out.println((A+B)%C);
		System.out.println((A%C + B%C)%C);
		System.out.println((A*B)%C);
		System.out.println((A%C * B%C)%C);
		

	}

}
