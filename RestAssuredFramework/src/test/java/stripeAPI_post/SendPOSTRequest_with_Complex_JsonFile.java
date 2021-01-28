	package stripeAPI_post;
	
	import static io.restassured.RestAssured.given;

import java.io.File;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
	
	public class SendPOSTRequest_with_Complex_JsonFile {
		
		
	@Test
	public void JsonFile() {
	//it will not create duplicate id by the server. so change the id appropriately. 
		Response response = given().contentType(ContentType.JSON)
				.body(new File("./user2.json")).log().all()  //log().all() will print everything
				.post("http://localhost:3000/student");
		response.prettyPrint();
		System.out.println(response.getStatusCode());
	}
	}
