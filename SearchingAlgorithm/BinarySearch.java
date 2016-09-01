package com.shiddiq.SearchingAlgorithm;

public class BinarySearch {

	public static int Binarysearch(int[] ArrayArg , int keyArg){
		int lo = 0 ;
		int hi = ArrayArg.length -1 ; 
			while (lo <= hi){
				int mid = lo + (hi -lo)/2;
				if (keyArg > mid  )  lo = mid +1;
				else if(keyArg < mid) hi = mid -1;
				else return mid;
								
			}
		
		return -1;
		}
	}
	
	

