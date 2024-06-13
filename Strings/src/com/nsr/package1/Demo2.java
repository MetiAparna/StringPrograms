package com.nsr.package1;

public class Demo2 {

	public static void main(String[] args) 
	{
		String s1="Sreekanth";
		for(int i=0;i<s1.length();i++)
		{
			char c=s1.charAt(i);
			System.out.println(c);
		}
		System.out.println("**************************************");
		char[] c=s1.toCharArray();
		for(char ch:c)
		{
			System.out.println(ch);
		}
	}

}
