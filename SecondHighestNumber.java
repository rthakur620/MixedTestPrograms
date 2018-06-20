package com.mix;

public class SecondHighestNumber {


	public static void main(String[] args) {
		int[] a = {12, 17, 10, 1010, 900 , 600};
		System.out.println("Second highest number in an array: "+secondHighestNumber(a));
	}
	
	private static int secondHighestNumber(int[] numbers){
		int max1 = 0;
		int max2 = 0;
		
		for (int i = 0; i < numbers.length; i++) {
			if(numbers[i] > max1){
				max2 = max1;
				max1 = numbers[i];
			}else if(numbers[i]>max2){
				max2 = numbers[i];
			}
		}
		
		return max2;
	}
}

