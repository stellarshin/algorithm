package For;

import java.util.Scanner;

/*
 * 
 * 문제
 * 오늘은 2007년 1월 1일 월요일이다. 그렇다면 2007년 x월 y일은 무슨 요일일까? 이를 알아내는 프로그램을 작성하시오.
 * 
 * 입력
 * 첫째 줄에 빈 칸을 사이에 두고 x(1≤x≤12)와 y(1≤y≤31)이 주어진다. 
 * 참고로 2007년에는 1, 3, 5, 7, 8, 10, 12월은 31일까지, 4, 6, 9, 11월은 30일까지, 2월은 28일까지 있다.
 * 
 * 출력
 * 첫째 줄에 x월 y일이 무슨 요일인지에 따라 SUN, MON, TUE, WED, THU, FRI, SAT중 하나를 출력한다.
 * 
 * 예제 입력 
 * 1 1
 * 
 * 예제 출력 
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
