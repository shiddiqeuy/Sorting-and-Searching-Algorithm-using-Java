package com.shiddiq.SortingAlgorithm;

public class BubbleSort {
	public static int[] BubbleSort(int[] Arrayin){
		int Arrayout[] = null;
		Boolean flag = true;
		int j = 0; 
		int tmp;
		System.out.println("============================");
		System.out.println("| BubleSort Method Started |");
		System.out.println("============================");
		System.out.println("\n");
		
		while (flag){
			flag=false;
			j++;
			System.out.println("====================================================");
			System.out.println("| init while Array size = "+Arrayin.length+" | j = "+j+" | flag = "+flag+" |");
			System.out.println("====================================================");
			for (int i = 0; i < Arrayin.length -j  ; i++){
				
				if(Arrayin[i]>Arrayin[i+1]){
					tmp = Arrayin[i];
					Arrayin[i]=Arrayin[i+1];
					Arrayin[i+1]=tmp;
					//swap true 
					flag = true;
					
				}
					String temparr=null;
					for (int arr : Arrayin)
					{
						temparr=temparr+" "+Integer.toString(arr);					
					}
					System.out.println("BubleSort Method loop swap inner for "+temparr+" value j = "+j+" | flag condition = "+flag);
			}
			String temparr = null;
			for (int arr : Arrayin)
			{
				temparr=temparr+" "+Integer.toString(arr);					
			}
			System.out.println("=================================================================================================");
			System.out.println("BubleSort Method loop swap outer while "+temparr+" value j = "+j+" |flag condition = "+flag);
			System.out.println("=================================================================================================");
			
		}
		
		//return
		 Arrayout = Arrayin;
		
		
		return Arrayout;
	}
	
	
	public static int[] BsortShiddiq(int[] Arrayin){
		Boolean swap=true;
		int temp=0;
		int j=0;
		while (swap){
			swap=false;
			j++;
			for(int i = 0 ; i < Arrayin.length-1 ; i++){
				if(Arrayin[i]>Arrayin[i+1]){
				 temp=Arrayin[i];
				 Arrayin[i]=Arrayin[i+1];
				 swap=true;
				 
				}
				
			}
			      
			
		}
		
		int[] Arrayout=Arrayin;		
		return Arrayout;
	}

}
