package Arrays.com.jsp;

public class SelectionSort
{
	public static void main(String[] args)
	{
		int[] a= {34,56,4,21,32,9,12};
		for(int d:a)
			System.out.print( d+" ");
		System.out.println();
		sort(a);
		for(int d:a)
			System.out.print(d+" ");
		
	}
	public static void sort(int[] a)
	{
		for(int i=0;i<a.length-1;i++)
		{
			int index=i;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[index]>a[j])
					index=j;
			}
			if(i!=index)
			{
				int t=a[i];
				a[i]=a[index];
				a[index]=t;
			}
		}
	}

}
