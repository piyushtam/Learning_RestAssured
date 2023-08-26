package createJSONUsingPOJO;

public class Address {
	
	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}

	public String getLocality() {
		return locality;
	}

	public void setLocality(String locality) {
		this.locality = locality;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String city;
	public int pin;
	public String locality;
	public String state;
	
	public Address(String city, int pin, String locality, String state) {
		this.city = city;
		this.pin = pin;
		this.locality = locality;
		this.state = state;
		
	}
	

}
