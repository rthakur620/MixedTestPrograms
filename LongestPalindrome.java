package com.mix;

public class LongestPalindrome {

	public static void main(String[] args) {
		System.out.println("Longest Palindrome: "+longestPalidrome("ABCDCBY"));
		//boolean isPalindrome  = isPalindrome("1212");
		//System.out.println("Palindrome"+isPalindrome);
		System.out.println("rahul".substring(0,3));
	}
	
	private static String longestPalidrome(String str){
		int length = str.length();
		for (int j = 0; j < length; j++) {
			for (int i = length; i > j; i--) {
				if(isPalindrome(str.substring(j, i))){
					return str.substring(j, i);
				}
			}
		}
		
		return "No palidrome substring exist";
	}
	
	private static boolean isPalindrome(String str){
		if(str.length()<=1){
			return false;
		}
		
		int length = str.length();
		
		for (int i = 0; i < length/2; i++) {
			if(str.charAt(i)==str.charAt(length-1-i)){
				continue;
			}else{
				return false;
			}
		}
		
		return true;
	}
}
