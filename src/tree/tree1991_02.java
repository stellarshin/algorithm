package tree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class tree1991_02 {

	static int n; // 노드 갯수
	static String[][] path; // 각 노드 데이터
	static ArrayList<String> list = new ArrayList<>(); // 출력을 위한 리스트

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine().trim());
		path = new String[n][3];
		String[] s;
		
		for (int i = 0; i < n; i++) {
			s = br.readLine().trim().split(" "); // 띄어쓰기(공백)으로 구분, 안하면 에러나네,,,,
			for (int j = 0; j < 3; j++) {
				path[i][j] = s[j];
			}
		}
		preorder("A");
		inorder("A");
		postorder("A");
		for(int i=0;i<list.size();i++){
			if(i%n==n-1){
				System.out.println(list.get(i));
			}else{
				System.out.print(list.get(i));
			}
		}
	}

	public static void preorder(String s) {
		for (int i = 0; i < n; i++) {
			if (s.equals(path[i][0])) {
				list.add(path[i][0]);
				if (!path[i][1].equals(".")) {
					preorder(path[i][1]);
				}
				if (!path[i][2].equals(".")) {
					preorder(path[i][2]);
				}
				break;
			}
		}
	}

	public static void inorder(String s) {
		for (int i = 0; i < n; i++) {
			if (s.equals(path[i][0])) {
				if (!path[i][1].equals(".")) {
					inorder(path[i][1]);
				}
				list.add(path[i][0]);
				if (!path[i][2].equals(".")) {
					inorder(path[i][2]);
				}
				break;
			}
		}
	}

	public static void postorder(String s) {
		for (int i = 0; i < n; i++) {
			if (s.equals(path[i][0])) {
				if (!path[i][1].equals(".")) {
					postorder(path[i][1]);
				}
				if (!path[i][2].equals(".")) {
					postorder(path[i][2]);
				}
				list.add(path[i][0]);
				break;
			}
		}
	}

}

