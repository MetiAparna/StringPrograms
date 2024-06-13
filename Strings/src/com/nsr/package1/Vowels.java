package com.nsr.package1;

public class Vowels {

	public static void main(String[] args) 
	{
		String s1="javakjewhqfkjhkwqje";
		char[]a=s1.toLowerCase().toCharArray();
		int count=0;
		for(char c:a)
		{
//			if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u')
			switch(c)
			{
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				count++;
			}
			
		}
		System.out.println("num of vowels ="+count);
	}
}
