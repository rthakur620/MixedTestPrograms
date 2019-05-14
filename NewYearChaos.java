package com.mix;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NewYearChaos {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3);
		int[] arr1 = {2 ,1, 5, 3, 4};
		int[] arr2 = {2, 5, 1, 3, 4};
		minimumBribes(arr1);
		minimumBribes(arr2);
	}
	
	static void minimumBribes(int[] q) {
	    int bribe = 0;
	    boolean chaotic = false;
	    int n = q.length;
	    for(int i = 0; i < n; i++)
	    {
	        if(q[i]-(i+1) > 2)
	        {               
	            chaotic = true;
	            break;     
	        }
	        for (int j = Math.max(0, q[i]-1-1); j < i; j++)
	            if (q[j] > q[i]) 
	                bribe++;
	    }
	    if(chaotic)
	        System.out.print("Too chaotic");
	    else
	    	System.out.print(bribe);
	}
}
