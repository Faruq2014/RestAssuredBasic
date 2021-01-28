package stripeAPI_post;

import static io.restassured.RestAssured.given;

import java.util.ArrayList;
import java.util.HashMap;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class SendPOSTRequest_Complex_Json_HashMap {
@Test
public void hasMap() {

	HashMap<String,Object> map = new HashMap<String,Object>();
	map.put("id", 4);
	map.put("title", "Selenium");
	map.put("First name", "Faruq");
	map.put("Last name", "Molla");
	map.put("author", "Faruq Molla");
	
	ArrayList<Integer> listOfPhone = new ArrayList<Integer>(); // array inside the json file
	listOfPhone.add(703222333);
	listOfPhone.add(572333444);
	map.put("Phone", listOfPhone);
	
	HashMap<String,String> address = new HashMap<String,String>();  // sub json file inside the root json file
	address.put("Street", "****pine");
	address.put("City", "Alexandria");
	address.put("State", "Virginia");
	address.put("Country", "USA");
	map.put("Adress", address);
	
	ArrayList<String> pSkills = new ArrayList<String>();  // array inside the json file
	pSkills.add("Java");
	pSkills.add("Data Base");
	pSkills.add("Rest Api");
	map.put("Primary Skills", pSkills);
	
	ArrayList<String> cSkills = new ArrayList<String>();  // array inside the json file
	cSkills.add("Unix");
	cSkills.add("Maven");
	cSkills.add("Git");
	cSkills.add("Jenkin");
	map.put("Secondary Skills", cSkills);
	
	
	Response response = given().contentType(ContentType.JSON).body(map).log().all()
			.post("http://localhost:3000/student");
	
	response.prettyPrint();
	System.out.println(response.getStatusCode());
}


}
