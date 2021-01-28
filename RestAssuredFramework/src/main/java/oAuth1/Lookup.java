package oAuth1;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Lookup {

	@Test
	public void lookupFunction() {
		Response resp = RestAssured.given().auth()
				.oauth("yKBFgH9yckehBs923GU0rHOYH", "G3aiCs6hFjp590e0AaMYLhHFFpy4nS1qMR9UGiJRCir0ytilWl",
						"1243695035805302784-eGsmB9PVKkmYmjTvodb20nSFjvEfQE",
						"eebj5Lpgi8l8dcZr8RnIEqNsreubYAyNqTiuXM8QKO1zP")
				.get("https://api.twitter.com/1.1/statuses/lookup.json?id=1323403802695868417");
		String body = resp.asString();
		System.out.println(body);
	}
}
