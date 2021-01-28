package basics;

import static io.restassured.RestAssured.get;

import org.testng.Assert;
import org.testng.annotations.Test;

public class GetData2 {

	@Test
	public void testResponseCode() {

		int code = get(
				"http://samples.openweathermap.org/data/2.5/weather?q=Lodon,uk&appid=b1b15e88fa797225412429c1c50c122a1")
						.getStatusCode();
		System.out.println("status code is" + code);
		Assert.assertEquals(code, 200);
		long time = get(
				"http://samples.openweathermap.org/data/2.5/weather?q=Lodon,uk&appid=b1b15e88fa797225412429c1c50c122a1")
						.getTime();
		System.out.println("Response time for data" + " " + time);
	}

	@Test
	public void testResponseBody() {

		String data = get(
				"http://samples.openweathermap.org/data/2.5/weather?q=Lodon,uk&appid=b1b15e88fa797225412429c1c50c122a1")
						.asString();
		System.out.println("status code is" + data);
		long time = get(
				"http://samples.openweathermap.org/data/2.5/weather?q=Lodon,uk&appid=b1b15e88fa797225412429c1c50c122a1")
						.getTime();
		System.out.println("Response time for data" + " " + time);
	}
}
