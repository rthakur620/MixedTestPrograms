package com.mix;

public class RotateArrayNintyDegree {

	
	public static void main(String[] args) {
		int[][] arr = {{1,2,3}, {4,5,6}, {7,8,9}};
		int[][] arr2 = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		rotateArray(arr2);
	}
	
	static void rotateArray(int[][] a){
		int temp = 0;
		int n = a.length;
		for (int i = 0; i < n-1; i++) {
			temp = a[i][n-1];
			a[i][n-1] = a[0][i];
			a[0][i] = a[(n-1)-i][0];
			a[(n-1)-i][0] = a[n-1][(n-1)-i];
			a[n-1][(n-1)-i] = temp;
			System.out.println(temp);
			System.out.println(a[i][n-1]);
			System.out.println(a[0][i]);
			System.out.println(a[n-1][i]);
			System.out.println(a[n-1][n-1]);
		}
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				//System.out.println(a[j][i]);
			}
		}
	}
}
