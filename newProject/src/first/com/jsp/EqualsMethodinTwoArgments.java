package first.com.jsp;

class Rectangle
{
	int lenth;
	int breadth;
	Rectangle(int l,int b)
	{
		lenth=l;
		breadth=b;
	}
	@Override
	public boolean equals(Object e)
	{
		if(!(e instanceof Rectangle))return false;
		Rectangle r=(Rectangle)e;
		return lenth==r.lenth && breadth==r.breadth;
		
	}
	
}
public class EqualsMethodinTwoArgments 
{

	public static void main(String[] args)
	{
       Rectangle r=new Rectangle(10,2);
       Rectangle r1=new Rectangle(10,2);
       System.out.println(r==r1);//false
       System.out.println(r.equals(r1));//true

       
	}

}
