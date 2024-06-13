package com.nsr.package1;

public class Knowledge
{
	public static void main(String[] args)
	{
		String s1="knowledge";
		String s2="";
		int i=0,j=s1.length()-1;
		int mid=i+j/2;
		for(int k=mid;k<s1.length();k++)
		{
			s2+=s1.charAt(k);
		}
		for(int y=mid-1;y>=0;y--)
		{
			s2+=s1.charAt(y);
		}
		System.out.println(s2);
		
	}

}
