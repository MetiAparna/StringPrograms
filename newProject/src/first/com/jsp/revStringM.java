package first.com.jsp;

public class revStringM 
{
	public static void main(String[] args)
	{
		String s="rama is good boy";
		char[] c=s.toCharArray();
		String s2="";
		int i=0,j=0;
		while(j<c.length)
		{
			while(j<c.length && c[j]!=' ')j++;
			String t=" ";
			int k=j-1;
			while(k>=i)
			{
				t+=c[k];
				k--;	
			}
			s2+=t;
			if(j<c.length)s2+=" ";
			j++;
			i=j;
		}
		System.out.println(s2);
		
		
	}

}
