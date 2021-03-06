package If;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

/*
 * 
 * 문제
 * 세준이는 기말고사를 망쳤다. 세준이는 점수를 조작해서 집에 가져가기로 했다. 
 * 일단 세준이는 자기 점수 중에 최대값을 골랐다. 이 값을 M이라고 한다. 그리고 나서 모든 점수를 점수/M*100으로 고쳤다.
 * 예를 들어, 세준이의 최고점이 70이고, 수학점수가 50이었으면 수학점수는 50/70*100이 되어 71.43점이 된다.
 * 세준이의 성적을 위의 방법대로 새로 계산했을 때, 새로운 평균을 구하는 프로그램을 작성하시오.
 * 
 * 입력 
 * 첫째 줄에 시험 본 과목의 개수 N이 주어진다. 이 값은 1000보다 작거나 같다. 
 * 둘째 줄에 세준이의 현재 성적이 주어진다. 이 값은 100보다 작거나 같은 음이 아닌 정수이고, 적어도 하나의 값은 0보다 크다.
 * 
 * 출력
 * 첫째 줄에 새로운 평균을 소수점 셋째 자리에서 반올림해 둘째자리까지 출력한다.
 * 
 * 예제 입력
 * 3
 * 40 80 60
 * 
 * 예제 출력
 * 75.00
 * 
 */

public class if_1546 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer n = new StringTokenizer(br.readLine());
		double cnt = Double.parseDouble(n.nextToken());
				
		StringTokenizer score = new StringTokenizer(br.readLine());
		
		ArrayList<Double> scores = new ArrayList<Double>();

		double sum = 0;
		
		for(int i=0; i<cnt; i++){
			scores.add(Double.parseDouble(score.nextToken()));
		}
		
		Collections.sort(scores);
		Collections.reverse(scores);
		
		double max = scores.get(0);
//		System.out.println(max);
		
		for(int j=0; j<cnt; j++){
			double tmp = scores.get(j)/max*100;
			scores.set(j, tmp);
		}
		
		
		for(int k=0; k<cnt; k++){
			sum += scores.get(k);
		}
		
//		System.out.println(sum/cnt);
		System.out.printf("%.2f", sum/cnt);
//		System.out.println((Math.round((sum/cnt)*1000d))/1000);

	}

}
