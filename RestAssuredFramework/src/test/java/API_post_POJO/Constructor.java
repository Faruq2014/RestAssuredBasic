	package API_post_POJO;
	
	import java.util.ArrayList;
	
	public class Constructor {
		
	private int id;
	private String Title;
	private String FirstName;
	private String LastName;
	private String Author;
	private ArrayList<Integer> Phone;
	private Address  address;
	private ArrayList<String> PrimarySkills;
	private ArrayList<String>SecondarySkills;
	
	// constructor injection
	public Constructor(int id, String title, String firstName, String lastName, String author,
			String Street, String City, String State, String Country
		 ) {
		super();
		this.id = id;
		this.Title = title;
		this.FirstName = firstName;
		this.LastName = lastName;
		this.Author = author;
		this.Phone  = new ArrayList<Integer>();
		this.address = new Address( Street, City,  State, Country);
		this.PrimarySkills = new ArrayList<String>();
		this.SecondarySkills = new ArrayList<String>();
	}
	// getter and setter method for accessing private field.
	// getter
	public int getId() {
		return id;
	}
	
	public String getTitle() {
		return Title;
	}
	
	public String getFirstName() {
		return FirstName;
	}
	
	public String getLastName() {
		return LastName;
	}
	
	public String getAuthor() {
		return Author;
	}
	
	public ArrayList<Integer> getPhone() {
		return Phone;
	}
	
	public Address getAddress() {
		return address;
	}
	
	public ArrayList<String> getPrimarySkills() {
		return PrimarySkills;
	}
	
	public ArrayList<String> getSecondarySkills() {
		return SecondarySkills;
	}
	
	
	//setter 
	public void setId(int id) {
		this.id = id;
	}
	
	public void setTitle(String title) {
		Title = title;
	}
	
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	
	public void setAuthor(String author) {
		Author = author;
	}
	
	public void setPhone(ArrayList<Integer> phone) {
		Phone = phone;
	}
	
	public void setAddress(Address address) {
		this.address = address;
	}
	
	public void setPrimarySkills(ArrayList<String> primarySkills) {
		PrimarySkills = primarySkills;
	}
	
	public void setSecondarySkills(ArrayList<String> secondarySkills) {
		SecondarySkills = secondarySkills;
	}
	
	
// method for phone number array
	public void setPhoneNumbers(int... phoneNumbers) {
		
		for(int i=0; i<phoneNumbers.length; i++) {
			
			this.Phone.add(phoneNumbers[i]);
		}
	}
	
	
	// method for PrimarySkills array
		public void setPrimarySkills(String... pskills) {
			
			for(int i=0; i<pskills.length; i++) {
				
				this.PrimarySkills.add(pskills[i]);
			}
		}
		
		
		// method for SecondarySkills array
				public void setSecondarySkills(String... Sskills) {
					
					for(int i=0; i<Sskills.length; i++) {
						
						this.SecondarySkills.add(Sskills[i]);
					}
				}
	
	
	
	
	}
