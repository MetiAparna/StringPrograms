package com.String.pack1;

public class HowMany_VowelsInString 
{

	public static void main(String[] args)
	{
		String s1="javadeveloper";
		char [] a=s1.toLowerCase().toCharArray();
		int count=0;
		for(char c : a)
		{
			switch (c)
			{
				case 'a':
				case 'e':
				case 'i':
				case 'o':
				case 'u':
					count++;
			}
			
		}
		System.out.println(count);
	}
}


