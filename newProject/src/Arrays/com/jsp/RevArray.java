package Arrays.com.jsp;

public class RevArray 
{
	public static void main(String[] args) 
	{
		int[] a= {1,2,3,4,5,6,7,8,9};
		for(int n:a)
			System.out.print(n);
		System.out.println();
		rev(a);
		for(int n:a)
			System.out.print(n);
		
	}

	 static int[] rev(int[] a)
	 {
       int i=0;
       int j=a.length-1;
       while(i<j) {
       int t=a[i];
       a[i]=a[j];
       a[j]=t;
       i++;
       j--;
       }
       return a;
    		   
	}

}
