package If;

import java.util.Scanner;

/*
 * 
 * ����
 * ���� ������ �Է¹޾� 90 ~ 100���� A, 80 ~ 89���� B, 70 ~ 79���� C, 60 ~ 69���� D, ������ ������ F�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * 
 * �Է�
 * ù° �ٿ� ���� ������ �־�����. ���� ������ 0���� ũ�ų� ����, 100���� �۰ų� ���� �ڿ����̴�.
 * 
 * ���
 * ���� ������ ����Ѵ�.
 * 
 * ���� �Է�
 * 100
 * 
 * ���� ���
 * A
 * 
 */
public class if_9498 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();
		
		if(score <= 100 && 90<=score) System.out.println("A");
		else if(score < 90 && 80<=score) System.out.println("B");
		else if(score < 80 && 70<=score) System.out.println("C");	
		else if(score < 70 && 60<=score) System.out.println("D");
		else System.out.println("F");
		
	}

}
