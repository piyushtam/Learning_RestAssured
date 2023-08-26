package jsonCreation;

import static io.restassured.RestAssured.given;

import org.json.JSONArray;
import org.json.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import restBasics.SetUp;

public class JsonObjAndArray extends SetUp {

	@Test (priority=0)
	public void createUser() {
		
		JSONObject json = new JSONObject();
		json.put("name", "Tamrakar");
		json.put("job", "Software Engineer");
		json.put("language", "Hindi");
		json.put("religion", "Indian");
		
		JSONArray jarray = new JSONArray();
		jarray.put("Delhi");
		jarray.put("JBP");
		jarray.put("Mumbai");
		
		json.put("city", jarray);
		
		JSONObject json1 = new JSONObject();
		json1.put("pin", 12345);
		json1.put("area", "ABC Street");
		
		json.put("address", json1);

		RequestSpecification req = given().contentType(ContentType.JSON).body(json.toString()).log().all();
		Response response = req.post("users");
		//response.prettyPrint();
		System.out.println("Status code: "+ response.statusCode());
		System.out.println("Response time: "+ response.getTime());
	}
	
	@Test (priority=1)
	public void createTwoUser() {
		
		JSONArray arr = new JSONArray();
		
		// 1st user
		JSONObject json = new JSONObject();
		json.put("name", "Tamrakar");
		json.put("job", "Software Engineer");
		json.put("language", "Hindi");
		json.put("religion", "Indian");
		
		JSONArray jarray = new JSONArray();
		jarray.put("Delhi");
		jarray.put("JBP");
		jarray.put("Mumbai");
		
		json.put("city", jarray);
		
		JSONObject json1 = new JSONObject();
		json1.put("pin", 12345);
		json1.put("area", "ABC Street");
		
		json.put("address", json1);
		
		// 2nd user
		JSONObject jsonN = new JSONObject();
		jsonN.put("name", "Piyush");
		jsonN.put("job", "Software Tester");
		jsonN.put("language", "English");
		jsonN.put("religion", "Hindu");
		
		JSONArray jarrayN = new JSONArray();
		jarrayN.put("Kolkata");
		jarrayN.put("Pune");
		jarrayN.put("Banglore");
		
		jsonN.put("city", jarrayN);
		
		JSONObject json1N = new JSONObject();
		json1N.put("pin", 11112);
		json1N.put("area", "Sector 62");
		
		jsonN.put("address", json1N);
		
		// Integrate both in array
		arr.put(json);
		arr.put(jsonN);
		
		
		RequestSpecification req = given().contentType(ContentType.JSON).body(arr.toString()).log().all();
		Response response = req.post("users");
		//response.prettyPrint();
		System.out.println("Status code: "+ response.statusCode());
		System.out.println("Response time: "+ response.getTime());
	}
}
