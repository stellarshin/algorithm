package tree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class tree_11725 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		List<Integer>[] parents = new List[100001];
		int[] result = new int[100001]; // ����� --> �θ���
		boolean[] check = new boolean[100001];
		
		check[1] = true;
		
		s.init(System.in);
		
		// ��� ���� �Է�  �ޱ�
		int N = s.nextInt();
		
		Queue q = new LinkedList();
		
		// �̾��� ���� �Է� �ޱ�
		for(int i=0; i<N-1; i++){
			int p = s.nextInt();
			int c = s.nextInt();
			
			// �Է¹��� ���� �� 1�� ���� ���
			if(p==1 || c==1){
				
				// p�� c �� ū ���� child
				// �������(result[]) child�� �θ�� 1 �� �־���
				int child = p>c ? p:c;
				q.add(child);
				
				check[child] = true;
				result[child] = 1;
			}else{
				if(parents[p]==null) {
					parents[p] = new ArrayList<Integer>();
				}
				
				if(parents[c] == null){
					parents[c] = new ArrayList<Integer>();
				}
				
				// �̾��� ����
				parents[p].add(c);
				parents[c].add(p);
			}
		}
		
		
		while(!q.isEmpty()){
			int parent = (int)q.poll();
			if(parents[parent]==null) continue;
			int size = parents[parent].size();
			
			for(int i=0; i<size; i++){
				if(!check[parents[parent].get(i)]){
					check[parents[parent].get(i)] = true;
					result[parents[parent].get(i)] = parent;
					q.add(parents[parent].get(i));
				}
			}
		}
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=2; i<=N; i++){
			sb.append(result[i]+"\n");
		}
		
		System.out.print(sb.toString());

	}
	
	static class s {
		static BufferedReader reader;
		static StringTokenizer tokenizer;
		
		static void init(InputStream input){
			reader = new BufferedReader(new InputStreamReader(input));
			tokenizer = new StringTokenizer("");
		}
		
		static String next() throws IOException{
			while(!tokenizer.hasMoreTokens()){
				tokenizer = new StringTokenizer(reader.readLine());
			}
			
			return tokenizer.nextToken();
		}
		
		static int nextInt() throws NumberFormatException, IOException{
			return Integer.parseInt(next());
		}
	}

}


