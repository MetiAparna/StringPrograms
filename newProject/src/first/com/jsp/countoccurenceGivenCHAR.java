package first.com.jsp;

import java.util.Scanner;

public class countoccurenceGivenCHAR {

	public static void main(String[] args)
	{
          Scanner s=new Scanner(System.in);
          System.out.println("enter a string");
          String s1=s.nextLine();
          String s2=s.next();
          String s3=" ";
          s3=s1.replace(s2, "");
          int count=s1.length()-s3.length();
          count=count/s2.length();
          System.out.println(s2+" exists "+count);
          
	}

}
