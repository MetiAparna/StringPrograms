package first.com.jsp;

public class repeatedharaters 
{
	public static void main(String[] args)
	{
		String s="aabbbbcce"+" ";
		int count=1;
		String s3="";
		 for(int i=0;i<s.length()-1;i++)
		 {
		     if(s.charAt(i)==s.charAt(i+1))
		     count++;
		     else
		     {
		    	 s3+=s.charAt(i)+""+count;
		    	 count=1;
		     }
		 }
		 System.out.println(s3);
	}
}
