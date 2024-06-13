
package com.String.pack1;

import java.util.Scanner;

public class Count_OccurancesOfEach_Character_InString {

	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter a String");
		String s1=scn.nextLine();
		String s2;
		while(s1.length()>0)
		{
			char c=s1.charAt(0);
			s2=s1.replace(c+"", "");
			int count=s1.length()-s2.length();
			System.out.println(c+"="+count);
			s1=s2;
		}
	}

}
