package For;

import java.util.Scanner;

/*
 * 
 * ����
 * ������ 2007�� 1�� 1�� �������̴�. �׷��ٸ� 2007�� x�� y���� ���� �����ϱ�? �̸� �˾Ƴ��� ���α׷��� �ۼ��Ͻÿ�.
 * 
 * �Է�
 * ù° �ٿ� �� ĭ�� ���̿� �ΰ� x(1��x��12)�� y(1��y��31)�� �־�����. 
 * ����� 2007�⿡�� 1, 3, 5, 7, 8, 10, 12���� 31�ϱ���, 4, 6, 9, 11���� 30�ϱ���, 2���� 28�ϱ��� �ִ�.
 * 
 * ���
 * ù° �ٿ� x�� y���� ���� ���������� ���� SUN, MON, TUE, WED, THU, FRI, SAT�� �ϳ��� ����Ѵ�.
 * 
 * ���� �Է� 
 * 1 1
 * 
 * ���� ��� 
 * MON
 * 
 */

public class for_1924 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int m = sc.nextInt();
		int d = sc.nextInt();

		int[] months = new int[13];
		months[1] = months[3] = months[5] = months[7] = months[8] = months[10] = months[12] =31;
		months[4] = months[6] = months[9] = months[11] = 30;
		months[2] = 28;

		int sum = 0;

		if(1<=m && m<=12 && 1<=d && d<=31){

			for(int i=1; i<=12; i++){
				if(i==m) break;

				sum += months[i];
			}


			sum += d;

			switch(sum%7){

			case 0:
				System.out.println("SUN");
				break;

			case 1:
				System.out.println("MON");
				break;

			case 2:
				System.out.println("TUE");
				break;

			case 3:
				System.out.println("WED");
				break;

			case 4:
				System.out.println("THU");
				break;

			case 5:
				System.out.println("FRI");
				break;

			case 6:
				System.out.println("SAT");
				break;

			}
		}
	}

}
