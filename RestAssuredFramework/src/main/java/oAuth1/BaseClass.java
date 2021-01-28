package oAuth1;

import org.testng.annotations.BeforeClass;

import io.restassured.RestAssured;
import io.restassured.authentication.AuthenticationScheme;

public class BaseClass {
	@BeforeClass
	public void setUp() {
		RestAssured.authentication = (AuthenticationScheme) RestAssured.given().auth().oauth(
				"yKBFgH9yckehBs923GU0rHOYH", "G3aiCs6hFjp590e0AaMYLhHFFpy4nS1qMR9UGiJRCir0ytilWl",
				"1243695035805302784-eGsmB9PVKkmYmjTvodb20nSFjvEfQE", "eebj5Lpgi8l8dcZr8RnIEqNsreubYAyNqTiuXM8QKO1zP");
	}
}
