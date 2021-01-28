package basics;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Put {

	@Test
	public void putFunction() {

		RequestSpecification request = RestAssured.given();
		request.header("Content-Type", "Application/json");
		JSONObject json = new JSONObject();
		json.put("id", 5);
		json.put("Department", "JS Developer");
		json.put("First name", "Arif");
		json.put("Last name", "Mia");
		json.put("Email", "am@yyyy");

		request.body(json.toJSONString());
		Response response = request.put("http://localhost:3000/student/5");
		int code = response.getStatusCode();
		System.out.println("Response code is " + " " + code);
		Assert.assertEquals(code, 200);
	}
}
