package api_post_JsonPath;
import static io.restassured.RestAssured.given;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
public class HowToGetValue {

	public static void main(String[] args) {
		Response response=given().contentType(ContentType.JSON)
		.formParam("id", 7)
		.formParam("title", "Java")
		.formParam("Author", "Faruq Molla")
		.formParam("Description", "Java Basics and OOPS concept")
		// adding array
		.formParam("Phone[0]", "703333").formParam("Phone[1]", "282333").formParam("Phone[2]", "3933333")
		// adding json object inside the root json object.
		.formParam("Adress[Street]", "****pine").formParam("Adress[City]", "Alexandria")
		.formParam("Adress[State]", "Virginia").formParam("Adress[Country]", "USA")
		// adding array
		.formParam("Primary Skills[0]", "Java").formParam("Primary Skills[1]", "Selenium")
		// adding array
		.formParam("Secondary Skills[0]", "Unix").formParam("Secondary Skills[1]", "Git")
		.post("http://localhost:3000/student");
		
		response.prettyPrint();
		System.out.println("status code is >>>>>>"+response.getStatusCode());
	}

}
