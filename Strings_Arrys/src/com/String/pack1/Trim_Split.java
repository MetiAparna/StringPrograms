package com.String.pack1;

public class Trim_Split {

	public static void main(String[] args)
	{
		String s1=" java is lang ";
		String s2=s1.trim();
		System.out.println(s2);
		String[]arr=s2.split(" ");
		for(String str:arr)
		{
			System.out.println(str);
		}
	}

}
