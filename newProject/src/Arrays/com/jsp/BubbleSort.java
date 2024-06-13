package Arrays.com.jsp;

public class BubbleSort
{
	public static void main(String[] args)
	{
		int[] a= {34,56,4,21,32,9,12};
		for(int d:a)
			System.out.print(d+" ");
		System.out.println();
		//System.out.println(a.length);
		sort(a);
		for(int d:a)
			System.out.print(d+" ");
	}
	public static void sort(int[] a)
	{
		
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=0;j<a.length-1-i;j++)
			{
				if(a[j]>a[j+1])
				{
					int t=a[j];
					a[j]=a[j+1];
					a[j+1]=t;
					
				}
			}
		}
		
	}

}
