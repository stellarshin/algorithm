package If;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
 * 
 * ����
 * ���� N���� �̷���� ���� A�� ���� X�� �־�����. �� ��, A���� X���� ���� ���� ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * 
 * �Է�
 * ù° �ٿ� N�� X�� �־�����. (1 �� N, X �� 10,000)
 * ��° �ٿ� ���� A�� �̷�� ���� N���� �־�����. �־����� ������ ��� 1���� ũ�ų� ����, 10,000���� �۰ų� ���� �����̴�.
 * 
 * ���
 * X���� ���� ���� �Է¹��� ������� �������� ������ ����Ѵ�. X���� ���� ���� ��� �ϳ� �����Ѵ�.
 * 
 * ���� �Է�
 * 10 5
 * 1 10 4 9 2 3 8 5 7 6
 * 
 * ���� ���
 * 1 4 2 3
 * 
 */
public class if_10871 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer ipt01 = new StringTokenizer(br.readLine());
		StringTokenizer ipt02 = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(ipt01.nextToken());
		int x = Integer.parseInt(ipt01.nextToken());
		
		int[] nArr = new int[n];
		
		for(int i=0; i<n; i++){
			
			nArr[i] = Integer.parseInt(ipt02.nextToken());
		}
		
		for(int j=0; j<n; j++){
			if(nArr[j]<x) System.out.print(nArr[j] + " ");
		}

	}

}
