package For;

import java.util.Scanner;

public class for_2441 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		if(1<=n && n<=100){
			for(int i=1; i<=n; i++){

				for(int j=1; j<i; j++){
					System.out.print(" ");
				}
				for(int k=n; i<=k; k--){
					System.out.print("*");
				}
				
				System.out.println();
			}
		}

	}

}
