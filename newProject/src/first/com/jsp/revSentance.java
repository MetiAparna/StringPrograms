package first.com.jsp;

public class revSentance 
{
	public static void main(String[] args) 
	{
		String s="rama is a good boy";
		char[] a=s.toCharArray();
		String s2="";
		
		for(int i=a.length-1;i>=0;i--)
		{
			s2+=a[i];
			
		}
		System.out.println(s2);
		
	}

}
