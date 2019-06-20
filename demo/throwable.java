package Demo_package;

public class throwable extends Exception
 {
	public String toString()
	{
		return "S1";
	}
   public static void main(String[] args)
	{	
	   System.out.println(  "Successfully garbage collected");
	}
   protected void finalize() throws throwable
   {
   	System.out.println(this +  " " +  "Successfully garbage collected");
   	
}
   void Sample (String s)
	{
		System.out.println("obj created......");
	}
}