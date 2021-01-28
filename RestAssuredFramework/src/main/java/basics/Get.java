package basics;

import static io.restassured.RestAssured.get; //manually made it static

import org.testng.Assert;
import org.testng.annotations.Test;

public class Get {

	@Test
	public void getFunction() {

		String data = get("http://localhost:3000/Student").asString();
		System.out.println(data);
		int code = get("http://localhost:3000/Student").statusCode();
		Assert.assertEquals(code, 200);
		System.out.println("this is the status code "+code);
		long time = get("http://localhost:3000/Student").getTime();
		System.out.println("executation time is" + " " + time);
	}

}
