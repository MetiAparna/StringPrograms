package first.com.jsp;

public class RevStringWithOutusing3var 
{
	public static void main(String[] args) 
	{
		String s1="java";
		String s2="devloper";
		 s1=s1+s2;//javadeveloper
		       // System.out.println(s1.indexOf(s2));4
		 s2=s1.substring(0,s1.indexOf(s2));//0,4
		 s1=s1.substring(s2.length());
		         //System.out.println(s2.length());4
		 System.out.println(s1);//developer
		 System.out.println(s2);//java
		 System.out.println();
		
		
	}

}
