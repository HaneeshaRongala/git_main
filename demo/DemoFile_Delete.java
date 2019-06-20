package Demo_package;

import java.io.File;
import java.io.IOException;

public class DemoFile_Delete
{
	public static void main(String[] args) throws IOException 
	{
	File fn=new File("C:\\Users\\Haneesha.Rongala\\Haneesha");
	{
	fn.delete();
}
	System.out.println("delete the file= " + fn);
     
	}
}
