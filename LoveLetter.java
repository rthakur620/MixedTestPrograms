package com.mix;

import java.util.HashMap;
import java.util.Map;

public class LoveLetter {

	
	public static void main(String[] args) {
		String[] magazineLines  = {"give", "me", "grand" ,"today", "night"};
		String[] notes = {"give", "one" ,"grand", "today"};
		String noteExistInMagazine = "No";
		Map<String, Integer> map = new HashMap<>();
		for (int i = 0; i < notes.length; i++) {
			if(map.get(notes[i])==null){
				map.put(notes[i], 1);
			}else{
				map.put(notes[i], map.get(notes[i])+1);
			}
		}
		
		int countOfNotesWords = notes.length;
		for (int i = 0; i < magazineLines.length; i++) {
			if(countOfNotesWords==0){
				noteExistInMagazine = "Yes";
				break;
			}
			
			if(map.get(magazineLines[i])!=null){
				if(map.get(magazineLines[i])==0){
					
				}else{
					map.put(magazineLines[i],map.get(magazineLines[i])-1);
					countOfNotesWords--;
				}
			}
		}
		
		System.out.println(noteExistInMagazine);
		
	}
}
