package If;

import java.util.Scanner;

/*
 * 
 * 문제
 * 세 정수 A, B, C가 주어진다. 이 때, 두 번째로 큰 정수를 출력하는 프로그램을 작성하시오. 
 * 
 * 입력
 * 첫째 줄에 세 정수 A, B, C가 공백으로 구분되어 주어진다. (1 ≤ A, B, C ≤ 100)
 * 
 * 출력
 * 두 번째로 큰 정수를 출력한다.
 * 
 * 예제 입력  
 * 20 30 10
 * 
 * 예제 출력  
 * 20
 * 
 * 예제 입력 2  
 * 30 30 10
 * 
 * 예제 출력 2  
 * 30
 * 
 * 예제 입력 3  
 * 40 40 40
 * 
 * 예제 출력 3  
 * 40
 * 
 * 예제 입력 4  
 * 20 10 10
 * 
 * 예제 출력 4  
 * 10
 * 
 */
public class if_10817 {

	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
		 
		 int[] n = new int[3];
		 int leng = n.length;
		 int tmp = 0;
		 
		 for(int i=0; i<leng; i++){
			 n[i] = sc.nextInt();
		 }

		 if(n[0]<=n[1]){
			 tmp = n[0];
			 n[0] = n[1];
			 n[1] = tmp;
		 } 
		 
		 if(n[0] <= n[2]){
			 tmp = n[0];
			 n[0] = n[2];
			 n[2] = tmp;
		 } 
		 
		 if(n[1] <= n[2]){
			 tmp = n[1];
			 n[1] = n[2];
			 n[2] = tmp;
		 }
		 
		 System.out.println(n[1]);
		 
	}
	
}
