package oAuth1;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetWithBase extends BaseClass {

	@Test
	public void getaFunction() {

		Response resp = RestAssured.given()
				.get("https://api.twitter.com/1.1/statuses/show.json?id=1323403802695868417");

		int code = resp.getStatusCode();
		Assert.assertEquals(code, 200);
		System.out.println("http code is " + " " + code);

		// String body = resp.getBody().asString();
		// System.out.println("long string body is " + " " + body);

		String body1 = resp.getBody().jsonPath().prettify();
		System.out.println("pretty body is " + " " + body1);

		// JsonPath path = resp.jsonPath();
		// String tweetID = path.get("id_str");
		// System.out.println("Tweet id is" + " " + tweetID);

	}
}
