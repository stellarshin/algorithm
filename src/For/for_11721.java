package For;

import java.util.Scanner;

/*
 * 
 * ����
 * ���ĺ� �ҹ��ڿ� �빮�ڷθ� �̷���� ���̰� N�� �ܾ �־�����.
 * �� �ٿ� 10���ھ� ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * 
 * �Է�
 * ù° �ٿ� �ܾ �־�����. 
 * �ܾ�� ���ĺ� �ҹ��ڿ� �빮�ڷθ� �̷���� ������, ���̴� 100�� ���� �ʴ´�. ���̰� 0�� �ܾ�� �־����� �ʴ´�.
 * 
 * ���
 * �Է����� �־��� �ܾ �� ���� ��� �� �ٿ� �ϳ��� ����Ѵ�. �ܾ��� ���̰� 10�� ����� �ƴ� ��쿡�� ������ �ٿ��� 10�� ������ ���ڸ� ����� ���� �ִ�.
 * 
 * ���� �Է�
 * BaekjoonOnlineJudge
 * 
 * ���� ���
 * BaekjoonOn
 * lineJudge
 * 
 */

public class for_11721 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		
		for(int i=0; i<str.length(); i++){
			if(i!=0 && i%10 == 0) System.out.println();
			System.out.print(str.charAt(i));
		}

	}

}
