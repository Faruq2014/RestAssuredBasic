	package API_post_POJO;
	
	public class Address {
		// global variable
		private String Street;
		private String City;
		private String State;
		private String Country;
		
		// constructor.
	public Address(String Street, String City, String State, String Country) {//local variable
	
		    this.Street = Street; // global = local, and we are using global by using this key word.
			this.City = City;
			this.State = State;
			this.Country = Country;
		}
	
	
	//getters
	public String getStreet() {
		return Street;
	}
	public String getCity() {
		return City;
	}
	public String getState() {
		return State;
	}
	public String getCountry() {
		return Country;
	}
	
	//setters
	public void setStreet(String street) {
		this.Street = street;
	}
	public void setCity(String city) {
		this.City = city;
	}
	public void setState(String state) {
		this.State = state;
	}
	public void setCountry(String country) {
		this.Country = country;
	}
	
	
	}
