package stripeAPI_get;

import static io.restassured.RestAssured.given;

import io.restassured.response.Response;
public class SendGetRequetsUsingRestAssured {
public static void main(String[] args) {
		
		Response response = given().header("Authorization", "Bearer sk_test_8Ek0AIAk0fyvUyJiDbG5ZOIN")
				.get("https://api.stripe.com/v1/customers/cus_FVSIfSz4Yrqqn6");
	
		response.prettyPrint();
	
	}
}
