package createJSONUsingPOJO;

import java.util.ArrayList;
import java.util.List;

public class User {
	
	public String email;	
	public String name;
	public String lastName;
	public List<String> technologies;
	public Address address;
	
	public User(String email, String name, String lastName) {
		
		this.email = email;
		this.name = name;
		this.lastName = lastName;
		technologies = new ArrayList<String>();
		
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public List<String> getTechnologies() {
		return technologies;
	}

	public void setTechnologies(List<String> technologies) {
		this.technologies = technologies;
	}
	
	public void createTechnologies(String technology) {
		this.technologies.add(technology);
	}
}
