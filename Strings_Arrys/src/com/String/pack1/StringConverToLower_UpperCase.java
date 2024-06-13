package com.String.pack1;

public class StringConverToLower_UpperCase 
{
	public static void main(String[] args)
	{
		System.out.println(palindrome("MAdam"));
	}
	public static boolean palindrome(String s)
	{
		char [] a=s.toLowerCase().toCharArray();
		int i=0,j=s.length()-1;
		while(i<j)
		{
			if(a[i] != a[j]) return false;
			i++;
			j--;
		}return true;
	}

}
