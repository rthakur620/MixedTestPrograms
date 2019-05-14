package com.mix.tree;

public class IsBinaryTree {

	public static void main(String[] args) {

		int[] arr = {8,4,9,1,2,3,6,5};
		int[] arr2 = {1 ,2 ,4 ,3 ,5 ,6 ,7};
		Node root = null;
		for (int i = 0; i < arr2.length; i++) {
			root = LowestCommonAncestor.insert(root, arr[i]);
		}
		
		checkBST(root);
	}
	
	
	static boolean checkBST(Node root){
		boolean flag = isBST(root);
        if(flag){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        
        return flag;
	}
	
	static boolean isBST(Node root){
		if(root==null){
			return true;
		}
		
        if(root.left!=null && root.left.data > root.data){
            return false;
        }
            
        if(root.right!=null && root.right.data < root.data){
            return false;
        }            
        
        boolean status = isBST(root.left);
        status = status && isBST(root.right);

        return status;        
    } 
	
}
