package first.com.jsp;

public class ConvertLOWERtoUpperVS 
{
	public static void main(String[] args) 
	{
		String s="JaVa";
		String s2="";
		char[] a=s.toCharArray();
		for(char c:a)
		{
			if(c>='a' && c<='z')
			{
				s2+=Character.toUpperCase(c);
			}
			else if(c>='A' && c<='Z')
			{
				s2+=Character.toLowerCase(c);
			}
				
		}
		System.out.println(s2);
		
	}

}
