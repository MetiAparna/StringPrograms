package first.com.jsp;

public class findHoeManyNumbersINString 
{
	public static void main(String[] args) 
	{
		String s="Aparna@0206";
		char[] c=s.toCharArray();
		int nm=0;
		int sum=0;
		for(char a:c)
		{
			if(a>='0' && a<='9')
			{
				nm++;
				System.out.println(a);
				sum+=a-'0';
			}
		}
		System.out.println("som of vowels "+sum);
		System.out.println("Hoemany Numbers  "+nm);
		
	}

}
