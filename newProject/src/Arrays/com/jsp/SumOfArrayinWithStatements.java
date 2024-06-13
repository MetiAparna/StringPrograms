package Arrays.com.jsp;

public class SumOfArrayinWithStatements {

	public static void main(String[] args)
	{
      int[] a= {10,20,30,40,44};
      int sum=0;
      String s=" ";
      for(int i=0;i<a.length;i++)
      {
    	  sum+=a[i];
    	  s+=a[i];
    	  if(a.length-1>i)s+="+";  
      }
      s+="="+sum;
      System.out.println(s);
	}

}
