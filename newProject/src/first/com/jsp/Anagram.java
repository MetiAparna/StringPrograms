package first.com.jsp;

//import java.lang.reflect.Array;
import java.util.Arrays;

public class Anagram 
{
	public static void main(String[] args) 
	{
		String s1="race";
		String s2="care";
		while(s1.length()==s2.length() && s1.length()!=0)
		{
		    char c=s1.charAt(0);
		     s1=s1.replace(c+"", "");
		     s2=s2.replace(c+"", "");
		}
		if(s1==s2)
			System.out.println("anagram");
		else
			System.out.println("Not anagram");
				
		
	/*	char[] c1=s1.toCharArray();
		char[] c2=s2.toCharArray();
		if(c1.length!=c2.length)
			System.out.println("not anagram");
		Arrays.sort(c1);
		Arrays.sort(c2);
		for(int i=0;i<c1.length;i++)
		{
			if(c1[i]!=c2[i])
				System.out.println("Not anagram");
			else
		
		System.out.println("anagram");
		}
		*/
	}

}
