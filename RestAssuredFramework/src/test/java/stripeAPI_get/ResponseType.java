package stripeAPI_get;

import static io.restassured.RestAssured.given;

import io.restassured.response.Response;
public class ResponseType {

	public static void main(String[] args) {
		
		Response response = given().auth().basic("sk_test_8Ek0AIAk0fyvUyJiDbG5ZOIN", "")
				.formParams("limit", 3).formParam("email", "trainer@way2automation.com")
			    .get("https://api.stripe.com/v1/customers");
		
		
		response.prettyPrint();  // json 
		//String jsonResponse = response.asString();
		//System.out.println(jsonResponse);  // String response.
		
		System.out.println("Response code --> "+response.statusCode());
	}
}
