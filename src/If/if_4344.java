package If;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

/*
 * 
 * ����
 * ���л� ��������� 90%�� �ڽ��� �ݿ��� ����� �Ѵ´ٰ� �����Ѵ�. ����� �׵鿡�� ���� ������ �˷���� �Ѵ�.
 * 
 * �Է�
 * ù° �ٿ��� �׽�Ʈ���̽� C�� �־�����.
 * ��° �ٺ��� �� �׽�Ʈ���̽� ���� ù ���� ���� N(1 <= N <= 1000)���� �л��� �־����� �� �������� N���� 0���� 100 ������ ������ �̾ �־�����.
 * 
 * ���
 * �� ���̽����� ���پ� ����� �Ѵ� �л����� ������ �Ҽ��� ��°�ڸ����� �ݿø��Ͽ� ����Ѵ�.
 * 
 * ���� �Է�
 * 5
 * 5 50 50 70 80 100
 * 7 100 95 90 80 70 60 50
 * 3 70 90 80
 * 3 70 90 81
 * 9 100 99 98 97 96 95 94 93 91
 * 
 * ���� ���
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
		
		
		// ���̽� �� ��ŭ ���� �Է� �ޱ�
		for(int i=0; i<N; i++){
			StringTokenizer score = new StringTokenizer(br.readLine());
			// �л� ��
			int cnt = Integer.parseInt(score.nextToken());
			int[] row = new int[cnt];
			
			// ���� �Է� �ޱ�
			for(int j=0; j<cnt; j++){
				row[j] = Integer.parseInt(score.nextToken());
				System.out.println(row[j]);
				sum += row[j];
			}
			
//			System.out.println("sum : " + sum);
			ava = sum/cnt;
//			System.out.println("ava : " + ava);
			
			// ��������� �Ѵ� �л� �� up
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
