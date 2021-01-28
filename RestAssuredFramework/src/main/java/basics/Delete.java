package basics;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Delete {

	@Test
	public void deleteFunction() {
		RequestSpecification request = RestAssured.given();
		Response response = request.delete("http://localhost:3000/posts/5");
		int code = response.getStatusCode();
		Assert.assertEquals(code, 200);

	}

}
