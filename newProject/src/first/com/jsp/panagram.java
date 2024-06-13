package first.com.jsp;

public class panagram 
{
	public static void main(String[] args) 
	{
		String s="the quick brown for jumps over the lazy dog max";//true
		System.out.println(panagram(s));
		
	}

    static boolean panagram(String s)
    {
    	if(s.length()<26)
    		return false;
    	else 
    	{
    		for(char i='a';i<='z';i++)
    		{
    			if(s.indexOf(i)<0)
    				return false;
    		}
    	}
		return true;
	}

}
