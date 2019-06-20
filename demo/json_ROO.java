package Demo_package;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class json_ROO 
{
	public static void main(String[] args) throws IOException, Exception 
	{
		JSONParser jsonParser=new JSONParser();
		try(FileReader reader=new FileReader("C:\\Users\\Haneesha.Rongala\\eclipse-workspace\\Demo\\bank1.json"))
				{
					JSONObject j=(JSONObject)jsonParser.parse(reader);
					System.out.println(j);
                	}
		}

}
