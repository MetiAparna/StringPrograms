package com.String.pack1;

import java.util.Stack;

public class CheckingStringBalance_Or_Not 
{
	public static void main(String[] args)
	{
		System.out.println(isBrackets("{[]}()[]"));
	}
	public static boolean isBrackets(String s)
	{
		Stack<Character>Stack=new Stack<Character>();
		for(int i=0;i<s.length();i++)
		{
			char ch1=s.charAt(i);
			if(ch1=='{' || ch1=='(' || ch1=='[')
			{
				Stack.push(ch1);
			}
			else if(ch1=='}' || ch1==')' || ch1==']')
			{
				if(Stack.isEmpty())
					return false;
				char ch2=Stack.pop();
				if(!ispair(ch2,ch1))
					return false;
			}
		}
		if(Stack.isEmpty())
			return true;
		return false;
	}
	public static boolean ispair(char ch1,char ch2)
	{
		if(ch1=='{' && ch2=='}') return true;
		if(ch1=='(' && ch2==')') return true;
		if(ch1=='[' && ch2==']') return true;
		return false;
	}

}
