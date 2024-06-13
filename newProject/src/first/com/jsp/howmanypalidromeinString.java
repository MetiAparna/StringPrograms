package first.com.jsp;

public class howmanypalidromeinString {

	public static void main(String[] args)
	{
      String s="madam";
      for(int i=0;i<s.length()-1;i++)
      {
    	  for(int j=i+2;j<=s.length();j++)
    	  {
    		  String s2=s.substring(i,j);
    		  if(isplaindrome(s2))
    		  System.out.println(s2);
    	  }
      }
	}

	private static boolean isplaindrome(String s2)
	{
		char[] c=s2.toCharArray();
		int i=0,j=c.length-1;
		while(i<j)
		{
			if(c[i]!=c[j])return false;
			
			i++;
			j--;
		}
		
		return true;
	}

}
