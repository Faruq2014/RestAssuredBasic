package auth;

import org.testng.annotations.BeforeClass;

import io.restassured.RestAssured;

public class BasePage {
	@BeforeClass
	public void setUpAuthentication() {
		RestAssured.authentication = RestAssured.preemptive().basic("ToolsQA", "TestPassword");
		RestAssured.baseURI = "http://restapi.demoqa.com/authentication/CheckForAuthentication/";

	}
}
