package com.String.pack1;

public class convert_lowerTo_Upper_GivenString {

	public static void main(String[] args) 
	{
		String s1="JAVA";
		String s2="";
		char[] a=s1.toCharArray();
		
		for(char c:a)
		{
			if(c>='A' && c<='Z')
			{
				s2=s2+Character.toLowerCase(c);
			}
			else if(c>='a' && c<='z')
			{
				s2=s2+Character.toUpperCase(c);
			}
			else
			{
				s2=s2+c;
			}
		}
		System.out.println(s1);
		System.out.println(s2);
	}

}
