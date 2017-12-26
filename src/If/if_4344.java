package If;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

/*
 * 
 * 문제
 * 대학생 새내기들의 90%는 자신이 반에서 평균은 넘는다고 생각한다. 당신은 그들에게 슬픈 진실을 알려줘야 한다.
 * 
 * 입력
 * 첫째 줄에는 테스트케이스 C가 주어진다.
 * 둘째 줄부터 각 테스트케이스 마다 첫 수로 정수 N(1 <= N <= 1000)명의 학생이 주어지고 그 다음으로 N명의 0부터 100 사이의 점수가 이어서 주어진다.
 * 
 * 출력
 * 각 케이스마다 한줄씩 평균을 넘는 학생들의 비율을 소수점 넷째자리에서 반올림하여 출력한다.
 * 
 * 예제 입력
 * 5
 * 5 50 50 70 80 100
 * 7 100 95 90 80 70 60 50
 * 3 70 90 80
 * 3 70 90 81
 * 9 100 99 98 97 96 95 94 93 91
 * 
 * 예제 출력
 * 40.000%
 * 57.143%
 * 33.333%
 * 66.667%
 * 55.556%
 * 
 */
public class if_4344 {
	
	static int N;

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer str = new StringTokenizer(br.readLine());
		N = Integer.parseInt(str.nextToken());
		int sum = 0;
		int ava = 0;
		int up = 0;
		
		
		ArrayList<Double> rlt = new ArrayList<Double>();
		
		
		// 케이스 수 만큼 성적 입력 받기
		for(int i=0; i<N; i++){
			StringTokenizer score = new StringTokenizer(br.readLine());
			// 학생 수
			int cnt = Integer.parseInt(score.nextToken());
			int[] row = new int[cnt];
			
			// 성적 입력 받기
			for(int j=0; j<cnt; j++){
				row[j] = Integer.parseInt(score.nextToken());
				System.out.println(row[j]);
				sum += row[j];
			}
			
//			System.out.println("sum : " + sum);
			ava = sum/cnt;
//			System.out.println("ava : " + ava);
			
			// 평균점수를 넘는 학생 수 up
			for(int k=0; k<cnt; k++){
				if(row[k]>ava) up++; 
			}
			
			System.out.println("up : " + up);
			System.out.println("cnt : " + cnt);
			
			int tmp =(up/cnt)*100;
			System.out.println("tmp : " + tmp);
//				rlt.add(m, tmp);
//		rlt.set(i, tmp);
//				System.out.println("rlt.get(i) : " + rlt.get(m));
		}
		
		
		/*for(int i=0; i<rlt.size(); i++){
			System.out.printf("%.4f", rlt.get(i));
		}*/

	}

}
