package com.mix;

import java.util.Arrays;

/**
 * Check is two strings are anagrams
 * @author HLCZ0172
 *
 */
public class Anagrams {

	
	public static void main(String[] args) {
		System.out.println(anagram("ifa", "faia"));
	}
	
	private static boolean anagram(String s1, String s2){
		char[] arr1 = s1.toCharArray();
		char[] arr2 = s2.toCharArray();
		boolean isAnagram = true;
		if(s1.length()!=s2.length()){
			isAnagram = false;
			return isAnagram;
		}
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		for (int i = 0; i < arr2.length; i++) {
			if(arr1[i] != arr2[i]){
				isAnagram = false;
				break;
			}
		}
		
		return isAnagram;
	}
}
