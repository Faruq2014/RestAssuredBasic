	package stripeAPI_post;
	
	import static io.restassured.RestAssured.given;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
	
	public class SendPOSTRequest_withJSON_Object {
		
	@Test
	public void simpleJsonObject() {
	JSONObject json = new JSONObject();
	// JSONObject is a HashMap like collection api. it works like object classs. as a resut it can 
	// take any type data as a value
	//  <!-- https://mvnrepository.com/artifact/com.googlecode.json-simple/json-simple -->
	json.put("id", 5);
	json.put("title", "Rest API");
	json.put("First name", "Faruq");
	json.put("Last name", "Molla");
	json.put("author", "Faruq Molla");
	
	JSONArray listOfPhone= new JSONArray ();
	//ArrayList<Integer> listOfPhone = new ArrayList<Integer>()
	// in array list, you must declare data type. 
	// in JSON array, it can take any type of data.
	listOfPhone.add(703222333);
	listOfPhone.add("addffsggsg");
	json.put("Phone", listOfPhone);
	
	JSONObject address = new JSONObject();
	address.put("Street", "****pine");
	address.put("City", "Alexandria");
	address.put("State", "Virginia");
	address.put("Country", "USA");
	json.put("Adress", address);
	
	
	Response response = given().contentType(ContentType.JSON)
	                        .body(json.toString()).log().all() //json is the reference object i created.
			                .post("http://localhost:3000/student");
	
	response.prettyPrint();
	System.out.println(response.getStatusCode());
	
	}
	
	
	}
