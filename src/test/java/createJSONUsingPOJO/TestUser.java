package createJSONUsingPOJO;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import restBasics.SetUp;

public class TestUser extends SetUp {
	
	@Test
	public void createUser() {
		
		User user = new User("piyush@gmail.com", "Piyush", "Tamrakar");
		user.createTechnologies("C++");
		user.createTechnologies("java");
		user.createTechnologies("python");
		
		Address address = new Address("New Delhi", 12345, "Uttam Nagar", "Delhi");
		user.setAddress(address);
		
		given().contentType(ContentType.JSON).log().body().body(user).post("users");		
	}
}
