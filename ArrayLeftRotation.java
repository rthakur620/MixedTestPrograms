package com.mix;

public class ArrayLeftRotation {

	public static void main(String[] args) {
		
		int a[] = {1,2,3,4,5};
		leftRotate(a, 2);
	}
	
	static int[] leftRotate(int a[], int d){
		int temp = 0;
		int length = a.length;
		while(d>0){
			temp = a[0];
			for (int i = 0; i<length-1; i++) {
				a[i] = a[i+1];
			}
			a[length-1] = temp;
			d--;
		}
		
		System.out.println("After Left Rotation");
		for (int i : a) {
			System.out.println(i);
		}
		
		return a;
	}
	
}
