package oAuth1;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Destroy {
	@Test
	public void destroyFunction() {
		Response resp = RestAssured.given().auth()
				.oauth("yKBFgH9yckehBs923GU0rHOYH", "G3aiCs6hFjp590e0AaMYLhHFFpy4nS1qMR9UGiJRCir0ytilWl",
						"1243695035805302784-eGsmB9PVKkmYmjTvodb20nSFjvEfQE",
						"eebj5Lpgi8l8dcZr8RnIEqNsreubYAyNqTiuXM8QKO1zP")
				.post("https://api.twitter.com/1.1/statuses/destroy/1244346959172960263.json");
		int code = resp.getStatusCode();
		Assert.assertEquals(code, 200);
		System.out.println("Destroyed the tweet. " + " " + code);

	}
}
