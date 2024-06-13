package com.basicp.homeproject;

public class eachNumberAdding {
	
	public static void main(String[] args) {
		
		int sum=0;
		int prod=1;
		int n=5;
		for(int a=1;a<=n;a++) {
			prod*=a;
		}
		System.out.println("total sum of n numbers="+ prod);
		
	}

}
