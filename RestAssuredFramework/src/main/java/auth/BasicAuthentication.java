	package auth;
	
	import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
	
	public class BasicAuthentication {
		@Test(priority = 0)
		public void manuelAuthentication() {
			int code = RestAssured.given().auth().preemptive().basic("ToolsQA", "TestPassword").when()
					.get("http://restapi.demoqa.com/authentication/CheckForAuthentication/").getStatusCode();
			System.out.println("the response conde is" + " " + code);
			Assert.assertEquals(code, 200);
		}
	
		@Test(priority = 1)
		public void openPage() {
			String body = RestAssured.given().auth().preemptive().basic("ToolsQA", "TestPassword").when()
					.get("http://restapi.demoqa.com/authentication/CheckForAuthentication/").getBody().asString();
			System.out.println(body);
		}
	
		@Test(priority = 2)
		public void openPagePrettyPrint() {
			Response response = RestAssured.given().auth().preemptive().basic("ToolsQA", "TestPassword").when()
					.get("http://restapi.demoqa.com/authentication/CheckForAuthentication/");
			System.out.println("pretty print is>>>>>>>");
			response.prettyPrint();
		}
	
		@Test(priority = 3)
		public void openPageJsonPrint() {
			Response response = RestAssured.given().auth().preemptive().basic("ToolsQA", "TestPassword").when()
					.get("http://restapi.demoqa.com/authentication/CheckForAuthentication/");
			String jsonResponse = response.asString();
			System.out.println("json Response print is>>>>>>>");
			System.out.println(jsonResponse);
		}
	}
