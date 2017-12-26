package tree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

 
public class tree1991_01 {
 
    public static void main(String[] args) throws IOException {
 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
        
         int t = Integer.parseInt(br.readLine());
         StringBuffer result = new StringBuffer();
 
         StringTokenizer str = null;
        
         node[] node_ar  = new node[26];
         for(int i = 0 ; i < t ; i++){
        	 
        	 node_ar[i] = new node();
        	 
         }
         for(int i = 0 ; i < t ; i++){
        	  
        	 str = new StringTokenizer(br.readLine());
        	 char temp  = str.nextToken().toString().charAt(0);
        	 int cur = temp-65;
        	 node_ar[cur].value = temp;
        	 temp  = str.nextToken().toString().charAt(0);
        	
        	 if( temp=='.'){
        		 node_ar[cur].left = null;
        	 }
        	 else{
        		 node_ar[cur].left = node_ar[temp-65];
        	 }
        	 
        	 temp  = str.nextToken().toString().charAt(0);
        	 
        	 if(  temp=='.'){
        		 node_ar[cur].right = null;
        	 }
        	 else{
        		 node_ar[cur].right = node_ar[temp-65];
        	 }
         }
         preorder(node_ar[0],result);
         result.append("\n");
         inorder(node_ar[0],result);
         
         result.append("\n");
         postorder(node_ar[0],result);
       
         System.out.println(result);
 
    }
    static void preorder(node root, StringBuffer result){
    	result.append(root.value);
    	if(root.left != null){
    		preorder(root.left, result);
    	}
    	if(root.right != null){
    		preorder(root.right, result);
    	}
    }
    static void inorder(node root, StringBuffer result){
    	if(root.left != null){
    		inorder(root.left, result);
    	}
    	result.append(root.value);
    	if(root.right != null){
    		inorder(root.right, result);
    	}
    }
    static void postorder(node root, StringBuffer result){
    	if(root.left != null){
    		postorder(root.left, result);
    	}
    	if(root.right != null){
    		postorder(root.right, result);
    	}
    	result.append(root.value);
    }
 
}
class node{
	node left;
	node right;
	char value;
}
