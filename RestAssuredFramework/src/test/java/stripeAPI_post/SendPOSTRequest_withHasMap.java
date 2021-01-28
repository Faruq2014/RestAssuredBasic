package stripeAPI_post;

import static io.restassured.RestAssured.given;

import java.util.HashMap;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
public class SendPOSTRequest_withHasMap {

	public static void main(String[] args) {
		//<!-- https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-databind -->
		//need jackson-databind dependency to work with has map
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("email", "eve.holt@reqres.in");
		map.put("password", "pistol");
		
		Response resp=given().contentType(ContentType.JSON).body(map)
		.when().post("https://reqres.in/api/register");
		resp.prettyPrint();

	}

}
