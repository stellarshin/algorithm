package For;

import java.util.Scanner;

/*
 * 
 * ����
 * n�� �־����� ��, 1���� n���� ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * 
 * �Է�
 * ù° �ٿ� n (1 �� n �� 10,000)�� �־�����.
 * 
 * ���
 * 1���� n���� ���� ����Ѵ�.
 * 
 */

public class for_8393 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		
		int sum = 0;
		
		if(1<=n && n<=10000){
			
			for(int i=1; i<=n; i++){
				sum += i;
			}
			
			System.out.println(sum);
			
		}
	}
}
