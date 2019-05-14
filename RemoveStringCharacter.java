package com.mix;

public class RemoveStringCharacter {

	public static void main(String[] args) {
		System.out.println(new RemoveStringCharacter().removeGivenStringChar("RahulKumar", 'u'));
	}
	
	public String removeGivenStringChar(String str, char givenChar){
		
		return str.replaceAll("u", "");
		
	}
}

