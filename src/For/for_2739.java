package For;

import java.util.Scanner;

public class for_2739 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		if(1<=n && n<=9){
			for(int i =1; i<=9; i++){
				System.out.println(n+" * "+i+" = "+ (n*i));
			}
		}

	}

}
