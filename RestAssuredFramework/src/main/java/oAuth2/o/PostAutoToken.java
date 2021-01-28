package oAuth2.o;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class PostAutoToken {
	@Test
	public void postFunction() {

		Response resp = RestAssured.given().formParam("client_id", "oAuth2")
				.formParam("client_secret", "bab35560918821f62ba4678c4883f15d")
				.formParam("grant_type", "client_credentials").post("http://coop.apps.symfonycasts.com/token");
		String token = resp.jsonPath().get("access_token");
		System.out.println("the access token is " + token);

		Response result = RestAssured.given().auth().oauth2(token)
				.post("http://coop.apps.symfonycasts.com/api/871/chickens-feed");
		int code = result.getStatusCode();
		System.out.println("the code is " + code);
		Assert.assertEquals(code, 200);
	}
}
