package operations;

import java.util.Scanner;

/*
 * 2839
 * ����̴� ���� �������忡�� ������ ����ϰ� �ִ�. 
 * ����̴� ���� �������Կ� ������ ��Ȯ�ϰ� Nų�α׷��� ����ؾ� �Ѵ�. 
 * �������忡�� ����� ������ ������ ����� �ִ�. ������ 3ų�α׷� ������ 5ų�α׷� ������ �ִ�.
 * ����̴� ������ ������, �ִ��� ���� ������ ��� ������ �Ѵ�. 
 * ���� ���, 18ų�α׷� ������ ����ؾ� �� ��, 3ų�α׷� ���� 6���� �������� ������, 
 * 5ų�α׷� 3���� 3ų�α׷� 1���� ����ϸ�, �� ���� ������ ������ ����� �� �ִ�.
 * ����̰� ������ ��Ȯ�ϰ� Nų�α׷� ����ؾ� �� ��, 
 * ���� �� ���� �������� �Ǵ��� �� ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
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
		
		//5�� ������ �������� �ʾ��� �� �������� 0�� �ƴҶ�
		if(totalKg%5 > 0){
			
			kg5Cnt = totalKg/5;
			remainKg = totalKg%5;
			kg3Cnt = totalKg/3;
			remainKg = remainKg%3;
			
			System.out.println("kg5Cnt : " + kg5Cnt);
			System.out.println("kg3Cnt : " + kg3Cnt);
			System.out.println("remainKg : " + remainKg);
			
			if(remainKg != 0){ // 5�� ������ �� 3���� ����� �������� 0�� �ƴ� ��
				
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
			
		}else{ // 5�� ������ �������� ��, �������� 0�϶�
			
			if(totalKg < 5){ // 5���� �������,
				if(totalKg == 3) totalCnt = 1; // 3�̸� totalCnt=1
				else totalCnt = -1; // 5���� �����鼭 3�ƴ� ���, totalCnt = -1
			}else totalCnt = totalKg/5; // �������� 0�̰� 5���� Ŭ ��� 
			
		}
		
		System.out.println(totalCnt);
		sc.close();
		
	}

}
