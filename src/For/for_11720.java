package For;

import java.util.Scanner;

/*
 * 
 * ����
 * N���� ���ڰ� ���� ���� �����ִ�. �� ���ڸ� ��� ���ؼ� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * 
 * �Է�
 * ù° �ٿ� ������ ���� N (1 �� N �� 100)�� �־�����. ��° �ٿ� ���� N���� ������� �־�����.
 * 
 * ���
 * �Է����� �־��� ���� N���� ���� ����Ѵ�.
 * 
 * ���� �Է� 
 * 1
 * 1
 * ���� ���
 * 1
 * 
 * ���� �Է� 2
 * 5
 * 54321
 * ���� ��� 2 
 * 15
 * 
 */
public class for_11720 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String str = sc.next();
		
		int rlt = 0;
		
		for(int i=0; i<n; i++){
//			rlt += (str.charAt(i)-'0');
			rlt += (str.charAt(i)-48);
//			rlt += (int)(str.charAt(i));
		}
		
		System.out.println(rlt);

	}

}
