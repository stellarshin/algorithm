package tree;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

/*
 * 
 * ��Ʈ ���� Ʈ���� �־�����. �� ��, Ʈ���� ��Ʈ�� 1�̶�� ������ ��, �� ����� �θ� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * 
 * �Է�
 * ù° �ٿ� ����� ���� N (1 �� N �� 100,000)�� �־�����. ��° �ٺ��� N-1���� �ٿ� Ʈ�� �󿡼� ����� �� ������ �־�����.
 * 
 * ���
 * ù° �ٺ��� N-1���� �ٿ� �� ����� �θ� ��� ��ȣ�� 2�� ������ ������� ����Ѵ�.
 * 
 * ���� �Է�
 * 7
 * 1 6
 * 6 3
 * 3 5
 * 4 1
 * 2 4
 * 4 7
 * 
 * ���� ���
 * 4
 * 6
 * 1
 * 3
 * 1
 * 4
 * 
 */

public class tree_11725_01 {
	
	static int N;
	static ArrayList<Integer> con [];
	static StringTokenizer st;
	static boolean visited[];
	static int parent[];

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// ��� ����
		N = Integer.parseInt(br.readLine());
		
		// ����� ����
		con = new ArrayList[N+1];
		
		// ����� ���� üũ ����
		visited = new boolean[N+1];
		
		// �θ�
		parent = new int[N+1];
		
		
		// �Էµ� ����
		for(int i=1; i<=N; i++){
			con[i] = new ArrayList<Integer>();
		}
		
		for(int i=1; i<=N-1; i++){
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			con[a].add(b);
			con[b].add(a);
		}
		
		Queue<Integer> que = new LinkedList<>();
		que.add(1);
		
		while(!que.isEmpty()){
			int curr = que.poll();
			
			for(int nxt:con[curr]){
				if(visited[nxt]) 
					continue;
				visited[nxt] = true;
				parent[nxt] = curr;
				que.add(nxt);
			}
		}
		
		for(int i=2; i<=N; i++){
			bw.append(parent[i] + "\n");
		}
		
		bw.flush();	
	}
	
}
