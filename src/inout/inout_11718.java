package inout;

import java.util.Scanner;

public class inout_11718 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		while(sc.hasNextLine()){
			String input = sc.nextLine();
			
			if(!(input.isEmpty() || input.length()>100)){
				System.out.println(input);
			}
		}

	}

}
