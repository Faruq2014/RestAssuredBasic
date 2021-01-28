package oAuth1;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class ReTweet {
	@Test
	public void postOnTweeter() {
		Response resp = RestAssured.given().auth()
				.oauth("yKBFgH9yckehBs923GU0rHOYH", "G3aiCs6hFjp590e0AaMYLhHFFpy4nS1qMR9UGiJRCir0ytilWl",
						"1243695035805302784-eGsmB9PVKkmYmjTvodb20nSFjvEfQE",
						"eebj5Lpgi8l8dcZr8RnIEqNsreubYAyNqTiuXM8QKO1zP")
				.post("https://api.twitter.com/1.1/statuses/retweet/1323403802695868417.json");

		int code = resp.getStatusCode();
		Assert.assertEquals(code, 200);
		System.out.println("http code is " + " " + code);

		// String body = resp.getBody().asString();
		// System.out.println("long string body is "+" "+body);

		String body1 = resp.getBody().jsonPath().prettify();
		System.out.println("pretty body is " + " " + body1);

		JsonPath path = resp.jsonPath();
		String tweetID = path.get("id_str");
		System.out.println("Tweet id is" + " " + tweetID);
	}
}
