package oAuth2.o;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import junit.framework.Assert;

public class PostManualToken {

	@Test
	public void getFunction() {
// every time you have to create a new token.
		//Response resp = RestAssured.given().auth().oauth2("3a8d39e11d64bf9a35bda46ee06a32d3333a813a")
		//		.post("http://coop.apps.symfonycasts.com/api/871/chickens-feed");
		Response resp = RestAssured.given().auth().oauth2("60d83ca25e7a247c18203e7fdd2b91d16bd4f9d1")
				.post("http://coop.apps.symfonycasts.com/api/871/chickens-feed");



		int code = resp.getStatusCode();
		System.out.println("the response code is  " + code);
		String body = resp.getBody().asString();
		System.out.println("the body is  " + body);
		Assert.assertEquals(code, 200);

	}
}
