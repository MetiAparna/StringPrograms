package first.com.jsp;

class Circle
{
	int radius;
	Circle(int r)
	{
		this.radius=r;
	}
	@Override
	public boolean equals(Object e)
	{
		if(!(e instanceof Circle)) return false;
		return radius==((Circle)e).radius;
	}
	
}
public class EqualsMethodimplimentation
{
	public static void main(String[] args)
	{
		Circle c=new Circle(3);
		Circle c1=new Circle(3);
		System.out.println(c==c1);//false
		System.out.println(c.equals(c1));//true
	}

}
