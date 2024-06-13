package first.com.jsp;

public class howManyVOwels 
{
	public static void main(String[] args)
	{
		String a="preposition";
		int count = 0;
		char[] c=a.toCharArray();
		for(char t:c)
		{
			switch(t)
			{
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				count++;
			}
			}
			
			System.out.println("num of vowels ="+count);
		
		
	}

}
