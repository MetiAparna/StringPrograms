package com.String.pack1;
class A
{
	 public boolean m1 (String s)
	 {
		 char[] a= s.toCharArray();
			int i=0,j=a.length-1;
			while(i<j)
			{
				if(a[i] != a[j]) return false;
				i++;
				j--;
			}
			return true;
	 }
}

public class StringPalindrome
{
	public static void main(String[] args) 
	{
		System.out.println(Palindrome("malayalam"));
		A a=new A();
		System.out.println(a.m1("sreekanth"));
	}

	static boolean Palindrome(String s)
	{
		char[] a= s.toCharArray();
		int i=0,j=a.length-1;
		while(i<j)
		{
			if(a[i] != a[j]) return false;
			i++;
			j--;
		}
		return true;
	}
}

