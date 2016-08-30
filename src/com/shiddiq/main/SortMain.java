package com.shiddiq.main;

import java.util.Random;

import com.shiddiq.SortingAlgorithm.BubbleSort;
import com.shiddiq.math.util;

public class SortMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		util UtilObj = new util();
		BubbleSort bsort = new BubbleSort(); 
		
		System.out.println("Hello World");
		int[] arrayint = new int[7];
		
		for (int i = 0 ; i < arrayint.length ; i++){
			
			arrayint[i]=util.getRandomNumberInRange(0,20);
			
		}
		int[] arrayint2 = arrayint;
		for (int arr : arrayint){
			System.out.println("value array before sort"+arr);
			
		}
		System.out.println("\n");
		arrayint=bsort.BubbleSort(arrayint);
		System.out.println("\n");
		
		for (int arr : arrayint){
			System.out.println("value array after sort "+arr);
			
		}
		
		
		System.out.println("\n");
		arrayint2=bsort.BsortShiddiq(arrayint2);
		System.out.println("\n");
		
		for (int arr : arrayint2){
			System.out.println("value array after sort method shiddiq "+arr);
			
		}

	}
	
	

}
