package If;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

/*
 * 
 * ����
 * �����̴� �⸻��縦 ���ƴ�. �����̴� ������ �����ؼ� ���� ��������� �ߴ�. 
 * �ϴ� �����̴� �ڱ� ���� �߿� �ִ밪�� �����. �� ���� M�̶�� �Ѵ�. �׸��� ���� ��� ������ ����/M*100���� ���ƴ�.
 * ���� ���, �������� �ְ����� 70�̰�, ���������� 50�̾����� ���������� 50/70*100�� �Ǿ� 71.43���� �ȴ�.
 * �������� ������ ���� ������ ���� ������� ��, ���ο� ����� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * 
 * �Է� 
 * ù° �ٿ� ���� �� ������ ���� N�� �־�����. �� ���� 1000���� �۰ų� ����. 
 * ��° �ٿ� �������� ���� ������ �־�����. �� ���� 100���� �۰ų� ���� ���� �ƴ� �����̰�, ��� �ϳ��� ���� 0���� ũ��.
 * 
 * ���
 * ù° �ٿ� ���ο� ����� �Ҽ��� ��° �ڸ����� �ݿø��� ��°�ڸ����� ����Ѵ�.
 * 
 * ���� �Է�
 * 3
 * 40 80 60
 * 
 * ���� ���
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
