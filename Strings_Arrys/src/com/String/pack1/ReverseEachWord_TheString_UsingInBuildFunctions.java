package com.String.pack1;

public class ReverseEachWord_TheString_UsingInBuildFunctions {

	public static void main(String[] args) 
	{
		String s1="java is an oops lang";
		String s2="";
		String[]a=s1.split(" ");
		for(String s:a)
		{
			s2=s2+rev(s);
			s2=s2+" ";
		}
		System.out.println(s2);
	}
	static String rev(String s)
	{
		char[]a=s.toCharArray();
		String s1="";
		for(int i=a.length-1;i>=0;i--)
		{
			s1=s1+a[i];
		}
		return s1;
	}

}
