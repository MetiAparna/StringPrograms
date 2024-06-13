package com.nsr.package1;

public class SumOf_Numbers_InString {

	public static void main(String[] args)
	{
		String s1="20h2j2j2h2kjj2h8";
		int sum=0;
		char[]a=s1.toCharArray();
		for(char ch:a)
		{
			if(ch>='0' && ch<='9')
			{
				sum=sum+(ch-'0');
			}
		}
		System.out.println("sum="+sum);
	}

}
