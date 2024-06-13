package com.String.pack1;

import java.util.Scanner;

public class Count_StrinsAnd_Charesters_InGivenString {

	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter a String");
		String s1=scn.nextLine();
		System.out.println("Enter a String to be counted");
		String s2=scn.nextLine();
		
		System.out.println(s1.length());
		System.out.println(s2.length());
		String s3=s1.replace(s2, "");
		System.out.println(s3.length());
		int count=s1.length()-s3.length();
		count=count/s2.length();
		System.out.println(s2+ " exist"  +count+ " times");
	}

}
