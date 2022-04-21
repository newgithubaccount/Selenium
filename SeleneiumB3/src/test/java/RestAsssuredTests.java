import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.testng.annotations.Test;

import groovy.json.JsonParser;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import testing.com.SeleneiumB3.PropertyReaderUtility;

public class RestAsssuredTests {
	
//	@Test
	public void getTest() throws FileNotFoundException, IOException
	{
		PropertyReaderUtility pros=new PropertyReaderUtility();
		RestAssured.baseURI=pros.getBaseurl();
		Response response=RestAssured.given().accept(ContentType.JSON).get(pros.getGetPwtWithid());
		System.out.println(response.getStatusCode());
		System.out.println(response.getBody().asString());
		System.out.println(response.getBody().prettyPrint());
		
	}
	
	@Test
	public void createPet() throws IOException, ParseException
	{
		PropertyReaderUtility pros=new PropertyReaderUtility();
		RestAssured.baseURI=pros.getBaseurl();
		Map<String,String> map=new HashMap<String,String>();
		map.put("aceept", "application/json");
		map.put("Content-Type", "application/json");
		String body=RestAsssuredTests.readFileConteant("./jsons/petcreate.json");
		Response response=RestAssured.given().headers(map).body(body).post("v2/pet");
		System.out.println(response.getStatusCode());
		System.out.println(response.asPrettyString());
		String jsonresponse=response.asString();
		RestAsssuredTests.parseJson(jsonresponse);
	}
	
	public static String readFileConteant(String fileName) throws IOException
	{
		String output="";
		
		BufferedReader br=new BufferedReader(new FileReader(new File(fileName)));
		String st="";
		while((st=br.readLine())!=null)
		{
			output+=st;
		}
	//	System.out.println(output);
		return output;
	}
	
	public static void parseJson(String response) throws ParseException
	{
		JSONParser parser=new JSONParser();
		JSONObject json=(JSONObject) parser.parse(response);
		System.out.println(json.get("id").toString());
		System.out.println(json.get("name").toString());
	}

}
