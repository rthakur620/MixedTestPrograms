package com.mix.tree;

public class LowestCommonAncestor {

	
	public static void main(String[] args) {
		int[] arr = {8,4,9,1,2,3,6,5};
		Node root = null;
		for (int i = 0; i < arr.length; i++) {
			root = insert(root, arr[i]);
		}
		
		Node lca = lca(root, 1,2);
		System.out.println("Lowest Common Ancestor"+lca.data);
		
	}
	
	
	
	public static Node insert(Node root, int data) {
        if(root == null) {
            return new Node(data);
        } else {
            Node cur;
            if(data <= root.data) {
                cur = insert(root.left, data);
                root.left = cur;
            } else {
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
    }
	
	
	
	
	
	public static Node lca(Node root, int v1, int v2) {
		
		if(root.data > v1 && root.data > v2){
            lca(root.left, v1, v2);
        }

        if(root.data < v1  && root.data < v2){
            lca(root.right, v1, v2);
        }
		
		
      	if(root.data==v1 || root.data==v2){
      		return root;
        }

        if(root.data > v1 && root.data < v2){
        	return root;
        }

        if((root.left.data == v1) || (root.left.data == v2) || (root.right.data == v1) || (root.right.data == v2)){
        	return root;
        }

        return root;
    }
}
