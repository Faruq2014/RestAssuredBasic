package auth;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class AuthenticationWithBasePage extends BasePage {

	@Test
	public void authentication() {
		int code = RestAssured.given().get().getStatusCode();
		Assert.assertEquals(code, 200);
		System.out.println("the code is" + " " + code);
	}
}
