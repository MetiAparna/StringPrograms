package first.com.jsp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class reapeatedSubStringsinregx {

	public static void main(String[] args) 
	{
       String s="abcdabcabc";
       Pattern p=Pattern.compile("([a-z]+)\\1+");
       Matcher m=p.matcher(s);
       while(m.find())
       {
    	   System.out.println(m.group());
       }
       
       
	}

}
