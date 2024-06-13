package com.nsr.package1;

public class Reverse_Each_Character {

	public static void main(String[] args) 
	{
		String s1="java is a oops lang";
		String s2="";
		char[]a=s1.toCharArray();
		for(int i=a.length-1;i>=0;i--)
		{
			s2=s2+a[i];
		}
		System.out.println(s1);
		System.out.println(s2);
	}

}
