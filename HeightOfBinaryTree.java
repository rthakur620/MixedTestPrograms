package com.mix.tree;

public class HeightOfBinaryTree {

	public static void main(String[] args) {
		int[] arr = {8,4,9,1,2,3,6,5};
		Node root = null;
		for (int i = 0; i < arr.length; i++) {
			root = LowestCommonAncestor.insert(root, arr[i]);
		}
		
		System.out.println("Height of the tree: "+height(root));
	}
	
	
	public static int height(Node root) {
        return heightOfBinaryTree(root)-1;
    }
	
	
	
	private static int heightOfBinaryTree(Node root){
        if(root == null){
            return 0;
       }
       
       int lHeight = heightOfBinaryTree(root.left);
       int rHeight = heightOfBinaryTree(root.right);

       if(lHeight >rHeight){
           return lHeight+1;
       }else{
          return rHeight+1;
       }
   }
}
