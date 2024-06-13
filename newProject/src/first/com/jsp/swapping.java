package first.com.jsp;

public class swapping
{
	public static void main(String[] args)
	{
		permutations("abcd",0,3);
	}

	 static void permutations(String s, int start, int end)
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

	 static String swap(String s, int i, int j) 
	{
		char[] c=s.toCharArray();
		char temp=c[i];
		c[i]=c[j];
		c[j]=temp;
		return new String(c);
	}

}
