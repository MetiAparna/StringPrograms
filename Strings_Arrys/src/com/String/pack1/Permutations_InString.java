package com.String.pack1;

public class Permutations_InString {

	public static void main(String[] args)
	{
		permutations("abc",0,2);
	}
	static void permutations(String s,int start,int end)
	{
		if(start==end)
		{
			System.out.println(s);
			return;
		}
		for(int i=start;i<=end;i++)
		{
			String s1=swap(s,start,i);
			permutations(s1,start+1,end);
		}
	}
	static String swap(String s,int i,int j)
	{
		char[]a=s.toCharArray();
		char temp=a[i];
		a[i]=a[j];
		a[j]=temp;
		return new String(a);
	}
	
}
