package first.com.jsp;

class tiger
{
	int radius;
	tiger(int r)
	{
		this.radius=r;
	}
	@Override
	public String toString()
	{
		return "circle[radius="+radius+"]";
		
	}
}
public class TOStringIMplimentation 
{
	public static void main(String[] args) 
	{
		tiger c=new tiger(3);
		System.out.println(c.toString());
		System.out.println(c);
		
	}

	

}
