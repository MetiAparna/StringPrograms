package com.String.pack1;

public class HowMany_numbers_inTheString_And_Sum {

	public static void main(String[] args) 
	{
		String s1="ab65c3d7e4";
		char[] a=s1.toCharArray();
		int sum=0;
		for(char c:a)
		{
			if(c>='0' && c<='9')
			{
				System.out.println(c);
				sum=sum+(c-'0');
			
			}
		}
		System.out.println("------------------------------");
		System.out.println(sum);
	}

}
