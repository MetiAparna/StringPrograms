package com.String.pack1;

public class StringConverToLower_UpperCase1
{
	public static void main(String[] args)
	{
		System.out.println(pali("madam"));
	}
	public static boolean pali(String s)
	{
		char [] a=s.toUpperCase().toCharArray();
		int i=0,j=s.length()-1;
		while(i<j)
		{
			if(a[i] != a[j]) return false;
			i++;
			j--;
		}return true;
		
	}
}
