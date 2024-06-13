package Arrays.com.jsp;

public class sumOFArray 
{
	public static void main(String[] args) 
	{
		int[] a= {20,30,40,50,10};
		int sum=0;
	/*	for(int i=0;i<a.length;i++)
		{
			sum+=a[i];
		}
		System.out.println(sum);
		*/
		for(int t:a)
		{
			sum+=t;
		}
		System.out.println(sum);
		
	}

}
