package restBasics;

import org.testng.annotations.BeforeSuite;

import io.restassured.RestAssured;

public class SetUp {

	@BeforeSuite
	public void setUp() {
		
		RestAssured.baseURI = "https://reqres.in/";
		RestAssured.basePath = "api/";
	}
}
