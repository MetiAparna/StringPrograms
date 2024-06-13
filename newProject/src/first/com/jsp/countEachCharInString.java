package first.com.jsp;

import java.util.Scanner;

public class countEachCharInString {

	public static void main(String[] args) 
	{
        Scanner s=new Scanner(System.in);
        System.out.println("enter aString");
        String s1=s.nextLine();
        String s2=" ";
        char c;
        int count=0;
        while(s1.length()>0)
        {
        	c=s1.charAt(0);
        	s2=s1.replace(c+"", "");
        	count=s1.length()-s2.length();
        	System.out.println(c+"= "+count);
        	s1=s2;
        }
	}

}
