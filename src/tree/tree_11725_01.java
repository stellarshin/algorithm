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
 * 루트 없는 트리가 주어진다. 이 때, 트리의 루트를 1이라고 정했을 때, 각 노드의 부모를 구하는 프로그램을 작성하시오.
 * 
 * 입력
 * 첫째 줄에 노드의 개수 N (1 ≤ N ≤ 100,000)이 주어진다. 둘째 줄부터 N-1개의 줄에 트리 상에서 연결된 두 정점이 주어진다.
 * 
 * 출력
 * 첫째 줄부터 N-1개의 줄에 각 노드의 부모 노드 번호를 2번 노드부터 순서대로 출력한다.
 * 
 * 예제 입력
 * 7
 * 1 6
 * 6 3
 * 3 5
 * 4 1
 * 2 4
 * 4 7
 * 
 * 예제 출력
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
		
		// 노드 갯수
		N = Integer.parseInt(br.readLine());
		
		// 연결된 정점
		con = new ArrayList[N+1];
		
		// 연결된 정점 체크 여부
		visited = new boolean[N+1];
		
		// 부모
		parent = new int[N+1];
		
		
		// 입력된 정점
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
