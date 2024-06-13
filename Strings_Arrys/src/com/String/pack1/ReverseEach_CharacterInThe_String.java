package com.String.pack1;

public class ReverseEach_CharacterInThe_String {

	public static void main(String[] args) 
	{
		String s1="java is an oops lang";
		String[] arr=s1.split("");
		String s2="";
		System.out.println(arr.length);
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.println(arr[i]);
			s2=s2+arr[i];
		}
		System.out.println(s2);
	}

}
