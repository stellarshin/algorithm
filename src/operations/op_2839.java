package operations;

import java.util.Scanner;

/*
 * 2839
 * 상근이는 요즘 설탕공장에서 설탕을 배달하고 있다. 
 * 상근이는 지금 사탕가게에 설탕을 정확하게 N킬로그램을 배달해야 한다. 
 * 설탕공장에서 만드는 설탕은 봉지에 담겨져 있다. 봉지는 3킬로그램 봉지와 5킬로그램 봉지가 있다.
 * 상근이는 귀찮기 때문에, 최대한 적은 봉지를 들고 가려고 한다. 
 * 예를 들어, 18킬로그램 설탕을 배달해야 할 때, 3킬로그램 봉지 6개를 가져가도 되지만, 
 * 5킬로그램 3개와 3킬로그램 1개를 배달하면, 더 적은 개수의 봉지를 배달할 수 있다.
 * 상근이가 설탕을 정확하게 N킬로그램 배달해야 할 때, 
 * 봉지 몇 개를 가져가면 되는지 그 수를 구하는 프로그램을 작성하시오.
 */

public class op_2839 {

	public static void main(String[] args) {
		
		int totalCnt = 0;
		int kg3Cnt = 0;
		int kg5Cnt = 0;
		int totalKg = 0;
		int remainKg = 0;
		
		Scanner sc = new Scanner(System.in);
		totalKg = sc.nextInt();
		
		System.out.println("totalKg : " + totalKg);
		
		//5로 나누어 떨어지지 않았을 때 나머지가 0이 아닐때
		if(totalKg%5 > 0){
			
			kg5Cnt = totalKg/5;
			remainKg = totalKg%5;
			kg3Cnt = totalKg/3;
			remainKg = remainKg%3;
			
			System.out.println("kg5Cnt : " + kg5Cnt);
			System.out.println("kg3Cnt : " + kg3Cnt);
			System.out.println("remainKg : " + remainKg);
			
			if(remainKg != 0){ // 5로 나누고 또 3으로 나누어도 나머지가 0이 아닐 때
				
				while(kg5Cnt > 0){
					kg5Cnt--;
					remainKg = remainKg + 5;
					
					System.out.println("kg5Cnt-- : " + kg5Cnt);
					System.out.println("remainKg + 5 : " + remainKg);
					
					if(remainKg%3 == 0){
						kg3Cnt = remainKg/3;
						remainKg = 0;
						
						System.out.println("kg3Cnt = remainKg/3 : " + kg3Cnt);
						
						break;
					}
				}
				
				if(remainKg !=0) totalCnt = -1;
				else totalCnt = kg5Cnt + kg3Cnt;
				
			}else totalCnt = kg5Cnt + kg3Cnt;
			
		}else{ // 5로 나누어 떨어졌을 때, 나머지가 0일때
			
			if(totalKg < 5){ // 5보다 작은경우,
				if(totalKg == 3) totalCnt = 1; // 3이면 totalCnt=1
				else totalCnt = -1; // 5보다 작으면서 3아닐 경우, totalCnt = -1
			}else totalCnt = totalKg/5; // 나머지가 0이고 5보다 클 경우 
			
		}
		
		System.out.println(totalCnt);
		sc.close();
		
	}

}
