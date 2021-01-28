package stripeAPI_post;
import static io.restassured.RestAssured.given;

import io.restassured.response.Response;
public class SendPOSTRequest_withParameter {

	
	public static void main(String[] args) {
	Response response=given().auth().basic("sk_test_8Ek0AIAk0fyvUyJiDbG5ZOIN", "")
	.formParam("name", "Faruq Molla")	
	.formParam("email", "Faruq@gmail.com")	
	.formParam("description", "this is very new api tester")	
	.post("https://api.stripe.com/v1/customers");
	response.prettyPrint();
	System.out.println("status code is >>>>>>"+response.getStatusCode());
	}
}
