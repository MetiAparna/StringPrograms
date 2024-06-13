package com.nsr.package1;

public class HowMany_Numbers_InString {

	public static void main(String[] args)
	{
		String s1="a1b2c3d4e5f3h3hg21hg242g424g";
		char[]a=s1.toCharArray();
		int count=0;
		for(char ch:a)
		{
			if(ch>='0' &&ch<='9')
			{
				count++;
			}
		}
		System.out.println("Numbers="+count);

	}

}
