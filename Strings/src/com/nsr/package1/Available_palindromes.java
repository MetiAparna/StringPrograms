package com.nsr.package1;

public class Available_palindromes {

	public static void main(String[] args) 
	{
		String s1="malayalam";
		String s2="";
		for(int i=0;i<=s1.length();i++)
		{
			for(int j=i+2;j<=s1.length();j++)
			{
				s2=s1.substring(i,j);
				if(ispalindrome(s2)) System.out.println(s2);
			}
		}
	}
	private static boolean ispalindrome(String s)
	{
		char[]a=s.toLowerCase().toCharArray();
		int i=0,j=s.length()-1;
		while(i<j)
		{
			if(a[i]!=a[j]) return false;
			i++;
			j--;
		}
		return true;
	}
	
	
}


