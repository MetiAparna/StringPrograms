package com.basicp.homeproject;

public class evenNumbers {
	
	public static void main(String[] args) {
		int count=0;
		for(int i=1;i<=10;i++) {
			if(i%2!=0) {
				System.out.print(" "+i+" ");
				count++;
			
			}
		}
		System.out.println();

		System.out.println("count of even Numbers "+count);
	}

}
