package basics;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetData {

	@Test
	public void testResponseCode() {
		Response resp = RestAssured.get(
				"http://samples.openweathermap.org/data/2.5/weather?q=Lodon,uk&appid=b1b15e88fa797225412429c1c50c122a1");

		int code = resp.getStatusCode();
		System.out.println("status code is" + code);
		Assert.assertEquals(code, 200);
		System.out.println("Response time for code" + " " + resp.getTime());

	}

	@Test
	public void testResponseBody() {
		Response resp = RestAssured.get(
				"http://samples.openweathermap.org/data/2.5/weather?q=Lodon,uk&appid=b1b15e88fa797225412429c1c50c122a1");
		String data = resp.asString();
		System.out.println("string data is" + " " + data);
		System.out.println("Response time for data" + " " + resp.getTime());

	}
}
