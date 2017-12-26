package For;

import java.util.Scanner;

public class for_2440 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);	
		int n = sc.nextInt();
		
		if(1<=n && n<=100){
			
			for(int i=1; i<=n; i++){
				for(int k=n; 0<=k-i; k--){
					System.out.print("*");
				}
				System.out.println();
			}
			
		}

	}

}
