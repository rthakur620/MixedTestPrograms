package com.mix;

public class HourGlass {

	
	public static void main(String[] args) {
		int[][] arr = {{-1,-1,0,-9,-2,-2},{-2,-1,-6,-8,-2,-5},{-1,-1,-1,-2,-3,-4},{-1,-9,-2,-4,-4,-5},{-7,-3,-3,-2,-9,-9},{-1,-3,-1,-1,-4,-5}};
		hourClockHighestSum(arr);
		
		int a = -1;
		int b = 0;
		if(a>b){
			System.out.println("Print A");
		}else{
			System.out.println("Print B");
		}
		
		
	}
	
	static int hourClockHighestSum(int[][] a){
		int sum  = 0;
		
		for (int i = 1; i < a.length-1; i++) {
			for (int j = 1; j < a.length-1; j++) {
				int sumOfClock = a[i][j] + a[i-1][j] + a[i-1][j+1] + a[i-1][j-1] + a[i+1][j+1] + a[i+1][j-1] + a[i+1][j] ;
				System.out.println(sumOfClock);
				if(i==1 && j==1){
					sum = sumOfClock;
				}
				
				if(sumOfClock > sum ){
					sum = sumOfClock;
				}
			}
		}
		System.out.println("Houclock highest sum: "+ sum);
		return sum;
	}
}
