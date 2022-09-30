package com.group;

public class Task10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr = {23, 8, 19, 94, 512};
		
		int largest = 0;
		
		for (int num:arr) {
			
			if (num > largest) {
				
				largest = num;
			}
		}
		
		int secLargest = 0; 
		
		 for  (int num:arr) {
			 
			 if (num == largest) {
				 
				 continue;
			 }
				 
			 else if (num>secLargest) {
					 
					 secLargest = num;
				 }
			 }
		 
		 System.out.println(secLargest);
			 
		 }

	}


