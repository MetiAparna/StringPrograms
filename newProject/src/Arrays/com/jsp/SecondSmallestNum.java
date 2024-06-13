package Arrays.com.jsp;

public class SecondSmallestNum {

	public static void main(String[] args)
	{
      int[] a= {33,5,23,6,78,90};
      int s1=a[0];
      int s2=a[0];
      for(int i=0;i<a.length;i++)
      {
    	  if(a[i]<s1)
    	  {
    		  s1=a[i];
    		  s2=s1;
    	  }
    	  else if(a[i]<s2 || s1==s2 )
    	  {
    		  if(a[i]!=s1)
    			  s2=a[i];
    	  }
      }
      System.out.println(s2);
	}

}
