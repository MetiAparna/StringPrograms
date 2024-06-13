package Arrays.com.jsp;

public class insertionSort 
{
	public static void main(String[] args)
	{
		int[] a= {34,56,4,21,32,9,12};
		for(int d:a)
			System.out.print(d+" ");
		System.out.println();
		sort(a);
		for(int d:a)System.out.print(d+" ");	
	}

	 static void sort(int[] a) 
	 {
		 for(int i=0;i<a.length;i++)
		 {
			 int key=a[i];
			 int j=i-1;
			 while(j>=0 && a[j]>key)
			 {
				 a[j+1]=a[j];
				 j--;
			 }
			 a[j+1]=key;
		 }
        	
	}

}
