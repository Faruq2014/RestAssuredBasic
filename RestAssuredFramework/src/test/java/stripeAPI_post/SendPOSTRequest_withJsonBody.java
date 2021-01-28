package stripeAPI_post;
import static io.restassured.RestAssured.given;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
public class SendPOSTRequest_withJsonBody {

	public static void main(String[] args) {
		String bodyString = "{\"email\":\"eve.holt@reqres.in\",\"password\":\"pistol\"}";
		//\"email\  \ this is how escape string inside the string.
		Response resp=given().contentType(ContentType.JSON).body(bodyString)
				      .when().post("https://reqres.in/api/register");
		
		resp.prettyPrint();
		System.out.println(resp.getStatusCode());
		
		ValidatableResponse resp2=given().contentType(ContentType.JSON).body(bodyString)
			      .when().post("https://reqres.in/api/register")
			      .then().statusCode(200);
		
	               System.out.println(resp2);
	            System.out.println(  resp2.statusCode(200));

	}
}
