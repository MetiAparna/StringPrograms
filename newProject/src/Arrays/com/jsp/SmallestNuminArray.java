package Arrays.com.jsp;

public class SmallestNuminArray 
{
	public static void main(String[] args) 
	{
	   int[] a= {34,55,3,99,88};
	   int small=a[0];
	   for(int i=0;i<a.length;i++)
	   {
		   if(a[i]<small)
		   {
			   small=a[i];
		   }
	   }
	   System.out.println(small);
	}

}
