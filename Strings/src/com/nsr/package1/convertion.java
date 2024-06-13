package com.nsr.package1;

public class convertion {

	public static void main(String[] args) 
	{
		String s1="malayalaM";
		char[] a=s1.toLowerCase().toCharArray();
		int i=0,j=s1.length()-1;
		while(i<j)
		{
			if(a[i]!=a[j])
			{
				 System.out.println("is not palindrome");
				 break;
			}
			i++;
			j--;
		}
		System.out.println(s1+" is a palindrome");
	}

}
