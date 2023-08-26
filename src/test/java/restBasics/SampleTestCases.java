package restBasics;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.*;

import java.io.File;

public class SampleTestCases extends SetUp {
	
	Response response = null;
	
	@Test (priority=1)
	public void sendRequest() {
		
		response = get("https://reqres.in/api/users?page=2");
		response.prettyPrint();
		
		System.out.println("Status code: "+ response.statusCode());
		System.out.println("Response time: "+ response.getTime());
	}
	
	@Test (priority=0)
	public void sendPostReq() {
				
		File file = new File("C:\\Users\\Piyush1993\\Desktop\\Piyush_docs\\Workspace\\Learning_RestAssured\\ReqBody.json");
		//response = given().contentType(ContentType.JSON).body(file).post("users");
		
		RequestSpecification req = given().contentType(ContentType.JSON).body(file).log().all();
		response = req.post("users");
		response.prettyPrint();
		System.out.println("Status code: "+ response.statusCode());
		System.out.println("Response time: "+ response.getTime());
		
	}
	
	@Test (priority = 3)
	public void deleteCustomer() {
		
		response = given().contentType(ContentType.JSON).log().all().delete("users/2");
		response.prettyPrint();
		System.out.println("Response code is: " + response.statusCode());
	}
	
	@Test (priority=2)
	public void updateCustomer() {
				
		File file1 = new File("C:\\Users\\Piyush1993\\Desktop\\Piyush_docs\\Workspace\\Learning_RestAssured\\update.json");
		
		RequestSpecification req = given().contentType(ContentType.JSON).body(file1).log().all();
		response = req.put("users/2");
		response.prettyPrint();
		System.out.println("Status code: "+ response.statusCode());
		System.out.println("Response time: "+ response.getTime());
		
	}
}
