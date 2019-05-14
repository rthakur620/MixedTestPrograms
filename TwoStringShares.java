package com.mix;

import java.util.HashMap;
import java.util.Map;

public class TwoStringShares {

	
	public static void main(String[] args) {
		String s1 = "hello";
		String s2 = "world";
		twoStringShareCommonSubstring(s1, s2);
		twoStringShareCommonSubstringByMap(s1, s2);
	}
	
	static String twoStringShareCommonSubstring(String s1, String s2){
		String shareString = "NO";
		
		for (int i = 0; i < s1.length(); i++) {
			for (int j = 0; j < s2.length(); j++) {
				if(s1.charAt(i)==s2.charAt(j)){
					shareString = "YES";
					break;
				}
			}
		}
		
		System.out.println(shareString);
		return shareString;
		
	}
	
	static String twoStringShareCommonSubstringByMap(String s1, String s2){
		String shareString = "NO";
		
		Map<Character, Integer>  map = new HashMap<>();
		for (int i = 0; i < s1.length(); i++) {
			map.put(s1.charAt(i), 0);
		}
		
		for (int i = 0; i < s2.length(); i++) {
			if(map.get(s2.charAt(i))!=null){
				shareString = "YES";
			}
		}
		System.out.println(shareString);
		return shareString;
		
	}
	
}
