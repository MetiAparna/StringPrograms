package com.String.pack1;

import java.util.Scanner;

public class StringPalindrome1 {

	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("enter your string");
		String s=scn.nextLine();
		String res="";
		
		for(int i=s.length()-1;i>=0;i--)
		{
			res= res+s.charAt(i);
		}	
		System.out.println(res);
		if(s.equals(res))
		{
			System.out.println("is palindrome");
		}
		else
		{
			System.out.println("is not a palindrome");
		}
		
	}
}
