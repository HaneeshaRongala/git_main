package Demo_package;

import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONObject;

public class FileWriter_JOO 
{
	public static void main(String[] args) throws IOException
	{
		JSONObject j=new JSONObject();
		j.put("Firstname","Haneesha");
		j.put("Lastname","Rongala");
		j.put("accountnno", 100002);
		JSONObject j1=new JSONObject();
		j1.put("employee1",j);
try(FileWriter file=new FileWriter("bank1.json"))
{
file.write(j1.toJSONString());
}
}

}
