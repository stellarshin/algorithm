package If;

import java.util.Scanner;

/*
 * 
 * ����
 * �� ���� A, B, C�� �־�����. �� ��, �� ��°�� ū ������ ����ϴ� ���α׷��� �ۼ��Ͻÿ�. 
 * 
 * �Է�
 * ù° �ٿ� �� ���� A, B, C�� �������� ���еǾ� �־�����. (1 �� A, B, C �� 100)
 * 
 * ���
 * �� ��°�� ū ������ ����Ѵ�.
 * 
 * ���� �Է�  
 * 20 30 10
 * 
 * ���� ���  
 * 20
 * 
 * ���� �Է� 2  
 * 30 30 10
 * 
 * ���� ��� 2  
 * 30
 * 
 * ���� �Է� 3  
 * 40 40 40
 * 
 * ���� ��� 3  
 * 40
 * 
 * ���� �Է� 4  
 * 20 10 10
 * 
 * ���� ��� 4  
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
