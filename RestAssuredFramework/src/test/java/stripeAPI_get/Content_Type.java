package stripeAPI_get;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
public class Content_Type {

	public static void main(String[] args) {
		Response response=given().contentType(ContentType.JSON)
		.header("Authorization", "Bearer sk_test_8Ek0AIAk0fyvUyJiDbG5ZOIN")
		.get("https://api.stripe.com/v1/customers");
		response.prettyPrint();
	}
	
	@Test
	public void content_Type() {
		Response response=given().header("content-type","application/json").auth().basic("sk_test_8Ek0AIAk0fyvUyJiDbG5ZOIN", "")
		.get("https://api.stripe.com/v1/customers");	
		response.prettyPrint();
	}

}
