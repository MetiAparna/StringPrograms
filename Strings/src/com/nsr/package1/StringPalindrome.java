package com.nsr.package1;

public class StringPalindrome {

	public static void main(String[] args) 
	{
		String s1="malayalam";
		char[] a=s1.toCharArray();
		int i=0,j=s1.length()-1;
		while(i<j)
		{
			if(a[i]!=a[j])
			{
				System.out.println("is not palindrome");
				return;
			}
			 i++;
			 j--;
		}
		System.out.println("is a palindrome");
		
	}

}
