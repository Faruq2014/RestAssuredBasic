package basics;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;

public class Post {

	@Test
	public void postFunction() {
		RequestSpecification request = RestAssured.given();
		request.header("Content-Type", "application/json");
		JSONObject json = new JSONObject();
		json.put("id", 15);
		json.put("Department", "Selenium");
		json.put("First name", "Murad");
		json.put("Last name", "Miah");
		json.put("Email", "mm@mail.com");
		request.body(json.toJSONString());
		Response response = request.post("http://localhost:3000/Student");
		int code = response.getStatusCode();
		Assert.assertEquals(code, 201);
		System.out.println("the code is "+code);

	}
}
