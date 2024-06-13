package com.nsr.package1;

import java.util.Scanner;

public class Count_Characters_InString {

	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("enter String");
		String s1=scn.nextLine();
		System.out.println("enter String to be counted");
		String s2=scn.nextLine();
		
		String s3=s1.replace(s2,"");
		int count=s1.length()-s3.length();
		count=count/s2.length();
		System.out.println(s2+" existes "+count+" time");

	}

}
