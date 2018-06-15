package com.mix;

public class PermutationOfString {

	
	public static void main(String[] args) {
		PermutationOfString permutationOfString = new PermutationOfString();
		permutationOfString.permutations("", "ABC");
		System.out.println("-------------------");
		permutationOfString.permutations("", "ABCDE");
	}
	
	
	private void permutations(String prefix, String str){
	    int n = str.length();
	    if(n==0){
	    	System.out.println(prefix);
	    }else{
	    	for (int i = 0; i < str.length(); i++) {
		    	permutations(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1,n));
			}
	    }
	    
	    
	}
}
