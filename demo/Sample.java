package Demo_package;

public class Sample
{
	public String toString()
	{																																																																													
		return " S1";
	}
	protected void finalize() throws Throwable
{
	 System.out.println(this +" "+"Successfully garbage collected");
}
	Sample (String s)
	{
		System.out.println("obj created......");
	}
}
