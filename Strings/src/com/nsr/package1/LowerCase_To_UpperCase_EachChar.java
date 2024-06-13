package com.nsr.package1;

public class LowerCase_To_UpperCase_EachChar {

	public static void main(String[] args) 
	{	
		String s1="abcdEFg";
		String s2="";
		char[]a=s1.toCharArray();
		for(char ch:a)
		{
			if(ch>='a' && ch<='z')
			{
				s2=s2+Character.toUpperCase(ch);
			}
			else if(ch>='A' && ch<='Z')
			{
				s2=s2+Character.toLowerCase(ch);
			}
		}
		System.out.println(s1);
		System.out.println(s2);
	}
}
