package jsonCreation;

import static io.restassured.RestAssured.given;

import java.util.ArrayList;
import java.util.HashMap;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import restBasics.SetUp;

public class CollectionMapAndList extends SetUp {
	
	@Test
	public void createUserUsingCollection() {
		
		HashMap<String,Object> json = new HashMap<String,Object>();
		json.put("name", "Tamrakar");
		json.put("job", "Software Engineer");
		json.put("language", "Hindi");
		json.put("religion", "Indian");
		
		ArrayList<String> jarray = new ArrayList<String>();
		jarray.add("Delhi");
		jarray.add("JBP");
		jarray.add("Mumbai");
		
		json.put("city", jarray);
		
		HashMap<String,Object> json1 = new HashMap<String,Object>();
		json1.put("pin", 12345);
		json1.put("area", "ABC Street");
		
		json.put("address", json1.toString());
		
		Response res = given().contentType(ContentType.JSON).body(json).log().all().post("users");
		res.prettyPrint();
		
		System.out.println("Status code: "+ res.statusCode());
		System.out.println("Response time: "+ res.getTime());
	}
}
