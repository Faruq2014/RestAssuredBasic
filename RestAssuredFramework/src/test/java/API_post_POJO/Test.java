package API_post_POJO;

import static io.restassured.RestAssured.given;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class Test {
//pojo=plain old java object
	public static void main(String[] args) {
		Constructor pojo = new Constructor(6, "Selenium", "Farid", "Sikder", "Farid Sikder", 
				"Duke Street", "Alexandria", "Virginia", "USA");
		//varargs
		pojo.setPhoneNumbers(703222333,202333444,303444555);
		pojo.setPrimarySkills("database","Manuel Testing","UFT");
		pojo.setSecondarySkills("Windows","Unix","Microsoft Office");
		

		Response response = given().contentType(ContentType.JSON).body(pojo).log().all()
				.post("http://localhost:3000/student");
		
		response.prettyPrint();
		System.out.println(response.getStatusCode());
	}

}
