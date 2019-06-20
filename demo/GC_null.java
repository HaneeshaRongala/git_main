package Demo_package;

public class GC_null 
{
	String object_name; 
	public  void Sample (String object_name)
	{
		this.object_name=object_name;
	}
	public static void main(String[] args)
	{
		Sample S1=new Sample("S1");
		S1=null;
		System.gc();
	}	
}
